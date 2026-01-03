package com.example.library.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDTO {
    @NotBlank
    private String title;
    //Жанр
    @NotBlank
    private String genre;
    //Автор
    @NotBlank
    private String author;
    //Издательство
    @NotBlank
    private String publisher;
    //Год издания
    @NotNull
    private LocalDate publishedDate;
    //Место издания
    @NotBlank
    private String placeOfPublication;

}
