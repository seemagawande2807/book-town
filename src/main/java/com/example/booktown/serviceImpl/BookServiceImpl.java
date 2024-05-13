package com.example.booktown.serviceImpl;

import com.example.booktown.dao.BookRepository;
import com.example.booktown.entity.Book;
import com.example.booktown.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public Book create(Book book) {
        return  bookRepository.save(book);
    }

    @Override
    public boolean updateBook(Book book, int bookId) {

        return false;
    }




}










