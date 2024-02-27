package hkw.onlineLibrary.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import hkw.onlineLibrary.service.BookService;
import hkw.onlineLibrary.model.Book;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping(value = "/books")
    public List<Book> getBook(){
        return bookService.getBooks();
    }
    
}
