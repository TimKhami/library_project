package com.example.library.controller;

import com.example.library.dto.BookDTO;
import com.example.library.modelEntity.Book;
import com.example.library.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("/")
    public ResponseEntity<Book> addBook(@RequestBody BookDTO bookDTO) {
        return new ResponseEntity<>(bookService.createBook(bookDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookService.findAllBooks(), HttpStatus.OK);
    }

    @DeleteMapping("/books/{id}") // <--От клиента получаем ИД и @PathVariable подставляем его в параметры метода deleteBook
    public ResponseEntity<Void> deleteBook(@PathVariable long id) {
        bookService.BookDelete(id);
        return ResponseEntity.noContent().build();
    }
}
