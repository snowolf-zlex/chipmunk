/**
 *
 */
package org.snowolf.chipmunk;

import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.snowolf.chipmunk.controller.LoanController;
import org.snowolf.chipmunk.domain.LoanType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author Snowolf
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoanTests {

  private MockMvc mvc;

  @Autowired
  private LoanController loanController;

  @Before
  public void setUp() {
    mvc = MockMvcBuilders.standaloneSetup(loanController).build();
  }

  @Test
  public void addLoanTypeTest() throws Exception {
    String paraJson = JSONObject.toJSONString(new LoanType("test"));
    Map<String, String> map = new HashMap<>();
    map.put("name", "test");

    MockHttpServletRequestBuilder b =
            MockMvcRequestBuilders.post("/loan/addLoanType", map)
                    .accept(MediaType.APPLICATION_JSON)
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(paraJson.getBytes());
    mvc.perform(b)
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andDo(MockMvcResultHandlers.print())
            .andReturn();
  }
}
