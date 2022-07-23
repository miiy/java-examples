package com.example.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.HeaderResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class UserControllerTests {
    @Test
    void testGetById(@Autowired MockMvc mvc) {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/users/1");

        try {
            mvc.perform(builder);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testGetByIdStatus(@Autowired MockMvc mvc) {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/users/1");

        StatusResultMatchers status = MockMvcResultMatchers.status();
        ResultMatcher ok = status.isOk();
        try {
            ResultActions action = mvc.perform(builder);
            action.andExpect(ok);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test
    void testGetByIdBody(@Autowired MockMvc mvc) {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/users/1");

        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher result = content.string("id=1");
        try {
            ResultActions action = mvc.perform(builder);
            action.andExpect(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testGetByIdHeader(@Autowired MockMvc mvc) {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/users/1");

        HeaderResultMatchers header = MockMvcResultMatchers.header();
        ResultMatcher result = header.string("Content-Type", "text/plain;charset=UTF-8");
        try {
            ResultActions action = mvc.perform(builder);
            action.andExpect(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
