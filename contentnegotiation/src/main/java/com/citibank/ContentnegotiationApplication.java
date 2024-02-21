package com.citibank;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.citibank.model.Book;

@SpringBootApplication
public class ContentnegotiationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentnegotiationApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	/*
	 * @Bean public CommandLineRunner run(RestTemplate restTemplate) throws
	 * Exception{ return args -> { Book book = restTemplate.getForObject(
	 * "http://localhost:8080/books/book/1?mediaType=json",Book.class);
	 * System.out.println(book.toString()); }; }
	 */
}
