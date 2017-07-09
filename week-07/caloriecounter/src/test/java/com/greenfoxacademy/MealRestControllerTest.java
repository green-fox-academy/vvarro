package com.greenfoxacademy;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import com.greenfoxacademy.repository.MealRepository;
import java.nio.charset.Charset;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = CaloriecounterApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class MealRestControllerTest {
  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Autowired
  MealRepository mealRepository;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testGetMealList() throws Exception {
    mockMvc.perform(get("/getmeals"))
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.[0].id").value("1"))
        .andExpect(jsonPath("$.[0].date").value("2017.11.30"))
        .andExpect(jsonPath("$.[0].type").value("Breakfast"))
        .andExpect(jsonPath("$.[0].description").value("Banana pancakes"))
        .andExpect(jsonPath("$.[0].calories").value(455))
        .andExpect(status().isOk());
  }


  @Test
  public void testGetStats() throws Exception {
    mockMvc.perform(get("/getstats"))
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.numberOfMeals").value(4))
        .andExpect(jsonPath("$.totalCalories").value(2863))
        .andExpect(status().isOk());
  }

  @Test
  public void testAddingMealToList() throws Exception {
    mockMvc.perform(post("/meal")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\n" +
            "     \"date\": \"2017-05-16\",\n" +
            "        \"type\": \"Breakfast\",\n" +
            "      \"description\": \"Ham and eggs\",\n" +
            "      \"calories\": 250\n" +
            "    }"))
        .andExpect(content().contentType(contentType))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.status").value("ok"));
  }

  @Test
  public void testUpdatingMeal() throws Exception {
    mockMvc.perform(put("/meal")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\n" +
            "     \"id\": \"3\",\n" +
            "     \"date\": \"2017-05-16\",\n" +
            "        \"type\": \"Breakfast\",\n" +
            "      \"description\": \"Ham and eggs\",\n" +
            "      \"calories\": 250\n" +
            "    }"))
        .andExpect(content().contentType(contentType))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.status").value("ok"));
  }

  @Test
  public void testDeleteById() throws Exception {
    mockMvc.perform(delete("/meal")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\n" +
            "     \"id\": \"3\"\n" +
            "    }"))
        .andExpect(content().contentType(contentType))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.status").value("ok"));

  }


}