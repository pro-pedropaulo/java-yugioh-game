package com.yugioh.game;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class LoginControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void loginRequiresBasicAuth() throws Exception {
        mockMvc.perform(post("/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isUnauthorized());
    }

    @Test
    void loginSuccess() throws Exception {
        String body = "{\"username\":\"yugi\",\"password\":\"123\"}";
        mockMvc.perform(post("/login")
                .with(SecurityMockMvcRequestPostProcessors.httpBasic("yugi", "123"))
                .contentType(MediaType.APPLICATION_JSON)
                .content(body))
                .andExpect(status().isOk())
                .andExpect(content().string("Login successful"));
    }

    @Test
    void loginFailureWrongPassword() throws Exception {
        String body = "{\"username\":\"yugi\",\"password\":\"bad\"}";
        mockMvc.perform(post("/login")
                .with(SecurityMockMvcRequestPostProcessors.httpBasic("yugi", "123"))
                .contentType(MediaType.APPLICATION_JSON)
                .content(body))
                .andExpect(status().isUnauthorized());
    }

    @Test
    void duelEndpointAccessibleWithoutAuth() throws Exception {
        mockMvc.perform(get("/duel"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").exists());
    }
}
