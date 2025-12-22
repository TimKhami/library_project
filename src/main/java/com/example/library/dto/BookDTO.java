package com.example.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDTO {

    private String title;
    //Жанр
    private String genre;
    //Автор
    private String author;
    //Издательство
    private String publisher;
    //Год издания
    private LocalDate publishedDate;
    //Место издания
    private String placeOfPublication;

}
