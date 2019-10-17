package com.tw.apistackbase;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tw.apistackbase.Service.ProsecutorService;
import com.tw.apistackbase.controller.ProsecutorController;
import com.tw.apistackbase.entity.Prosecutor;
import com.tw.apistackbase.repository.ProsecutorRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.hasSize;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@ActiveProfiles(profiles = "test")
@WebMvcTest(ProsecutorController.class)
public class ProsecutorAPITest {

    @MockBean
    private  ProsecutorService prosecutorService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void should_get_all_prosecutors() throws Exception {
        List<Prosecutor> prosecutors = new ArrayList<>();
        Prosecutor prosecutor1 = new Prosecutor();
        prosecutor1.setName("Tin");
        Prosecutor prosecutor2 = new Prosecutor();
        prosecutor2.setName("Rev");
        Prosecutor prosecutor3 = new Prosecutor();
        prosecutor3.setName("Tubs");
        prosecutors.add(prosecutor1);
        prosecutors.add(prosecutor2);
        prosecutors.add(prosecutor3);

        when(prosecutorService.getAll()).thenReturn(prosecutors);

        ResultActions result = mockMvc.perform(get("/api/prosecutors"));
        result.andExpect(jsonPath("$", hasSize(3)));

    }

    @Test
    void should_add_a_prosecutor() throws Exception {
        when(prosecutorService.save(any())).thenReturn(true);
        ResultActions result = mockMvc.perform(post("/api")
                .content(new ObjectMapper().writeValueAsString(new Prosecutor()))
                .contentType(MediaType.APPLICATION_JSON));
        result.andExpect(status().isCreated());

    }
}
