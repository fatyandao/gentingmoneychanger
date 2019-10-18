package com.genting.moneychanger.api;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.net.URL;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.http.MediaType;
import static org.hamcrest.Matchers.equalTo;




@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class MoneyChangerAssessmentApplicationTests {

    @LocalServerPort
    private int port;

    private URL base;
    
	@Autowired
    private MockMvc mvc;
	
	@Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/");
    }
	
	@Test
	void contextLoads() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/transactions").accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().string(equalTo("Sorry, this link is not assessible.")));
	}

}
