package com.example.library.modelEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    //Идентификатор
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    //Название
    @Column(nullable = false)
    private String title;
    //Жанр
    @Column(nullable = false)
    private String genre;
    //Автор
    @Column(nullable = false)
    private String author;
    //Издательство
    @Column(nullable = false)
    private String publisher;
    //Год издания
    @Column(nullable = false)
    private LocalDate publishedDate;
    //Место издания
    @Column(nullable = false)
    private String placeOfPublication;


}
