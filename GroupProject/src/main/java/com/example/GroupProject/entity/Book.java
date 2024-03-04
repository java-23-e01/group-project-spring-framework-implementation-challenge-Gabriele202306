package com.example.GroupProject.entity;

import jakarta.persistence.*;

@Entity
public class Book {

    //Define the columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookName;

    //Define the many-to-one relationship with author
    @ManyToOne
    @JoinColumn(name = "author_id", nullable=false)
    private Author author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author=" + author.getLastName() +
                '}';
    }
}
