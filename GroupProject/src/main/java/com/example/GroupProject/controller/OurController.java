package com.example.GroupProject.controller;

import com.example.GroupProject.repo.AuthorRepository;
import com.example.GroupProject.repo.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OurController {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public OurController(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        model.addAttribute("books", bookRepository.findAll());
        return "home";
    }
}
