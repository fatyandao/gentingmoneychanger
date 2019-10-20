package com.genting.moneychanger.api;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;
import java.net.URL;

import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.genting.moneychanger.api.dao.ExchangeRateRepository;
import com.genting.moneychanger.api.model.ExchangeRate;
import com.genting.moneychanger.api.model.Transaction;

import org.springframework.http.MediaType;





@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ComponentScan({"com.genting.moneychanger.api.config","com.genting.moneychanger.api.controller","com.genting.moneychanger.api","com.genting.moneychanger.api.dao", "com.genting.moneychanger.model"})
@ContextConfiguration(classes = {Transaction.class, ExchangeRate.class, org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager.class})
class MoneyChangerAssessmentApplicationTests {

	@Value("${server.port}")
	private int port;

	private URL base;

	@Autowired
	private MockMvc mvc;

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private ExchangeRateRepository rateRepo;

	@Before
	public void setUp() throws Exception {
		this.base = new URL("http://localhost:" + port + "/");
	}

	@Test
	void contextLoads() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/transactions").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().is4xxClientError())
		;
	}

	@Test
	@Transactional
	void findExchangeRate() throws Exception{
		ExchangeRate rate = new ExchangeRate();
		rate.setBuyRate(new BigDecimal(3.00));
		rate.setSellRate(new BigDecimal(0.333));
		rate.setIsoName("MYR");
		entityManager.persist(rate);
		entityManager.flush();

		// when
		ExchangeRate found = rateRepo.findById(rate.getIsoName()).orElse(new ExchangeRate());

		// then
		Assert.assertEquals(found.getIsoName(), rate.getIsoName());

	}

}
