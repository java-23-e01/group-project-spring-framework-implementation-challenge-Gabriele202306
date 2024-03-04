package com.example.GroupProject;

import com.example.GroupProject.entity.Author;
import com.example.GroupProject.entity.Book;
import com.example.GroupProject.repo.AuthorRepository;
import com.example.GroupProject.repo.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GroupProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(GroupProjectApplication.class, args);
	}


@Bean
public CommandLineRunner crudOperations(AuthorRepository authorRepository, BookRepository bookRepository) {
	return args -> {

		/*
		//Create Author
		Author author1 = new Author();
		author1.setFirstName("Steven");
		author1.setLastName("King");

		Author author2 = new Author();
		author2.setFirstName("Herman");
		author2.setLastName("Melville");

		authorRepository.save(author1);
		authorRepository.save(author2);

		// Create books
		Book book1 = new Book();
		book1.setBookName("IT");
		book1.setAuthor(author1);

		Book book2 = new Book();
		book2.setBookName("Carrie");
		book2.setAuthor(author1);

		Book book3 = new Book();
		book3.setBookName("Moby Dick");
		book3.setAuthor(author2);

		bookRepository.save(book1);
		bookRepository.save(book2);
		bookRepository.save(book3);
			*/

		//Read all
		System.out.println("All authors: ");
		authorRepository.findAll().forEach(System.out::println);

		System.out.println("All books: ");
		bookRepository.findAll().forEach(System.out::println);

	};
}
}
