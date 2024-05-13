package com.example.booktown.service;

import com.example.booktown.entity.Book;

import java.util.List;

public interface BookService {


    public List<Book> getAllBooks();


    Book create(Book book);


    boolean updateBook(Book book, int bookId);

}
