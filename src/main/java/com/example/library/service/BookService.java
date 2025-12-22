package com.example.library.service;

import com.example.library.dto.BookDTO;
import com.example.library.modelEntity.Book;
import com.example.library.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class BookService {

    private BookRepository bookRepository;

    public Book createBook(BookDTO bookDTO) {
        Book book = Book.builder()
                .title(bookDTO.getTitle())
                .genre(bookDTO.getGenre())
                .author(bookDTO.getAuthor())
                .publisher(bookDTO.getPublisher())
                .publishedDate(bookDTO.getPublishedDate())
                .placeOfPublication(bookDTO.getPlaceOfPublication())
                .build();
        return bookRepository.save(book);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book BookUpdate(Book book) {
        return bookRepository.save(book);

    }

    public void BookDelete(long id) {
        bookRepository.deleteById(id);
    }
}
