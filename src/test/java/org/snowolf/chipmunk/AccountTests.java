package org.snowolf.chipmunk;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.snowolf.chipmunk.controller.AccountController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountTests {

  @Autowired
  private AccountController accountController;

  private MockMvc mvc;

  @Before
  public void setUp() {
    mvc = MockMvcBuilders.standaloneSetup(accountController).build();
  }

  @Test
  public void getAccountTest() throws Exception {
    mvc.perform(
            MockMvcRequestBuilders.get("/account/getAccount?id=3")
                    .accept(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andDo(MockMvcResultHandlers.print())
            .andReturn();
  }
}
