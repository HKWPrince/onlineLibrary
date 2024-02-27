package hkw.onlineLibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hkw.onlineLibrary.model.Book;
import hkw.onlineLibrary.repository.BookRepo;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    public List<Book> getBooks(){
        return bookRepo.findAll();
    }
}
