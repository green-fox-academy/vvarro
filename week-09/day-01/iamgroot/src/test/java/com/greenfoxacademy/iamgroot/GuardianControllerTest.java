package com.greenfoxacademy.iamgroot;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = IamgrootApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void WithQueryParam_ReceiveGrootGreet() throws Exception {
    mockMvc.perform(get("/groot?message=somemessage"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received").value("somemessage"))
        .andExpect(jsonPath("$.translated").value("I am Groot!"));
  }

  @Test
  public void WithoutQueryParam_ReceiveGrootGreet() throws Exception {
    mockMvc.perform(get("/groot"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error").value("I am Groot!"));
  }

  @Test
  public void WithQueryParam_ReceiveYonduArrow() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.speed").value("10.0"));
  }

  @Test
  public void WithoutQueryParam_ReceiveYonduArrow() throws Exception {
    mockMvc.perform(get("/yondu"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error").value("I am Groot!"));
  }

  @Test
  public void WithQueryParam_ReceiveShipStatusEmpty() throws Exception {
    mockMvc.perform(get("/rocket"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.shipstatus").value("empty"));
  }

  @Test
  public void WithQueryParam_ReceiveShipStatusFourty() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=5000"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.shipstatus").value("40%"));
  }

  @Test
  public void WithQueryParam_ReceiveShipStatusFull() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=12500"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.ready").value("true"))
        .andExpect(jsonPath("$.shipstatus").value("full"));
  }

}
