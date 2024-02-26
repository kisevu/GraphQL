package com.ameda.kevin.kisevu.GraphiQL;

import com.ameda.kevin.kisevu.GraphiQL.entity.Book;
import com.ameda.kevin.kisevu.GraphiQL.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphQLApplication {
	public static void main(String[] args) {
		SpringApplication.run(GraphQLApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(BookRepository bookRepository){
		return args -> {
			Book cleanCode = new Book("Dark clouds","Kevin Ameda Kisevu");
			bookRepository.save(cleanCode);
		};
	}
}
