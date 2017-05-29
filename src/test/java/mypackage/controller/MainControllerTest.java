package mypackage.controller;

import mypackage.configure.Application;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

//
/**
 * Created by f on 28.05.17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@AutoConfigureMockMvc
public class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void noParamGreetingShouldReturnDefaultMessage() throws Exception {

        this.mockMvc.perform(get("/myservice/greeting")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Vax"));
    }

    @Test
    public void paramGreetingShouldReturnTailoredMessage() throws Exception {

        this.mockMvc.perform(get("/myservice/greeting").param("name", "Spring"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Spring"));
    }


/*
   public void checkBook() throws Exception {

        this.mockMvc.perform(get("/book/11"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Learning Spring Boot"));
    }

    @Test
    public void checkUser() throws Exception {

        this.mockMvc.perform(get("/user/20"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Dione Newlin"));

*/
}
