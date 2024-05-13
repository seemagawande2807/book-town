package com.example.booktown.Controller;

import com.example.booktown.dao.CustomerRepository;
import com.example.booktown.entity.Book;
//import com.example.booktown.entity.Users;
import com.example.booktown.entity.Customer;
import com.example.booktown.service.BookService;
//import com.example.booktown.service.UserService;

import com.example.booktown.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.RequestEntity.*;

@RestController
public class Controller {
    @Autowired
    private BookService bookService;
    @Autowired
    private CustomerService customerService;


    @PostMapping("/createBook")
    public Book createBook(@RequestBody Book book) {
        return bookService.create(book);
    }

    @PostMapping("/saveCustomer")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);


    }

    @PutMapping("/books/{bookId}")
    public ResponseEntity<Object> updateBook(@RequestBody Book book, @PathVariable("bookId") int bookId) {
        // Call the service layer to update the book
        boolean updated = bookService.updateBook(book, bookId);

        if (updated) {
            return ResponseEntity.ok().build(); // Return 200 OK if the book was successfully updated
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/customers/{customerId}")
    public ResponseEntity<Object> updateCustomer(@RequestBody Customer customer, @PathVariable("customerId") int customerId) {
        boolean updated = customerService.updateCustomer(customer, customerId);

        if (updated) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}







