package org.snowolf.chipmunk;

import com.alibaba.fastjson.JSON;
import java.util.List;
import javax.sql.DataSource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.snowolf.chipmunk.controller.IndexController;
import org.snowolf.chipmunk.domain.User;
import org.snowolf.chipmunk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainApplicationTests {

  @Autowired
  private DataSourceProperties dataSourceProperties;

  @Autowired
  private ApplicationContext applicationContext;
  
  @Autowired
  private UserService userService;

  @Autowired
  private IndexController indexController;

  private MockMvc mvc;

  @Before
  public void setUp() throws Exception {
    mvc = MockMvcBuilders.standaloneSetup(indexController).build();
  }

  @Test
  public void testRequest() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/index").accept(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andDo(MockMvcResultHandlers.print())
            .andReturn();
  }


  @Test
  public void changePasswordTest() {
    User u = (User) userService.loadUserByUsername("zlex");
    u.setPassword(new BCryptPasswordEncoder().encode("123456"));
    userService.changePassword(u);
  }

  @Test
  public void contextLoads() {
    // 获取配置的数据源
    DataSource dataSource = applicationContext.getBean(DataSource.class);
    // 查看配置数据源信息
    System.out.println(dataSource);
    System.out.println(dataSource.getClass().getName());
    System.out.println(dataSourceProperties);
    // 执行SQL,输出查到的数据
    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
    List<?> resultList = jdbcTemplate.queryForList("select * from account");
    System.err.println("===>>>>>>>>>>>" + JSON.toJSONString(resultList));
  }
}
