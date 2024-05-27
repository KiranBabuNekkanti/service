package com.api.books;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class BooksController {

    @Value("${message}")
    private String message;

    @Value("${title}")
    private String title;

    @Value("${password}")
    private String password;

    private final BookService bookService;

    @GetMapping
    public ResponseEntity<String> helloWorld() {
        String value = "Title: " + title + ", Message: " + message + ", My Password is: " + password;
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(value);
    }

    @PostMapping(value = "/books")
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.saveBook(book));
    }

    @GetMapping(value = "/books")
    public ResponseEntity<List<Book>> getBooks(){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(bookService.getBooks());
    }
}