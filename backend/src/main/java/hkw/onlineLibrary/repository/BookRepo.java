package hkw.onlineLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hkw.onlineLibrary.model.Book;

public interface BookRepo extends JpaRepository<Book, String> {
    Book findByISBN(String ISBN);
}
