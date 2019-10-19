package com.genting.moneychanger.api;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.genting.moneychanger.api.model.ExchangeRate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.genting.moneychanger.api.controller","com.genting.moneychanger.api","com.genting.moneychanger.api.dao", "com.genting.moneychanger.model"})
public class MoneyChangerAssessmentApplication {
	private static final Logger log = LoggerFactory.getLogger(MoneyChangerAssessmentApplication.class);

	public static void main(String[] args) {
		//		SpringApplication app = new SpringApplication(MoneyChangerAssessmentApplication.class);
		//        app.setDefaultProperties(Collections
		//          .singletonMap("server.port", "8083"));
		//        app.run(args);
		SpringApplication.run(MoneyChangerAssessmentApplication.class, args);
	}


	@Autowired
	JdbcTemplate jdbcTemplate;
	public void run(String... strings) throws Exception {

//		log.info("Creating tables");

//		jdbcTemplate.execute("DROP TABLE exchange_rates IF EXISTS");
//		jdbcTemplate.execute("CREATE TABLE exchange_rates(" +
//				"currency_pair_id INTEGER, "
//				+ "buy_rate DECIMAL(23,16), "
//				+ "sell_rate DECIMAL(23,16) )");
//
//		List<ExchangeRate> rates = new ArrayList<ExchangeRate>();
//		ExchangeRate rate = new ExchangeRate();
//		rate.setBuyRate(new BigDecimal(0.742164));
//		rate.setSellRate(new BigDecimal(1.34782));
//		rate.setCurrencyPairId(1);
//		rates.add(rate);
//
//		// Uses JdbcTemplate's batchUpdate operation to bulk load data
//		jdbcTemplate.update("INSERT INTO exchange_rates(currency_pair_id, buy_rate, sell_rate) VALUES (?,?,?)", 
//				rate.getCurrencyPairId(), rate.getBuyRate(), rate.getSellRate());


	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();   
	}
	
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }

        };
    }
//    @Bean
//    public CorsFilter corsFilter() {
//        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        final CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.setAllowedOrigins(Collections.singletonList("*"));
//        config.setAllowedHeaders(Arrays.asList("Origin", "Content-Type", "Accept"));
//        config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH"));
//        source.registerCorsConfiguration("/**", config);
//        return new CorsFilter(source);
//    }
}
