package ru.mail.library;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BookModel {
    private int id;
    private AuthorModel author;
    private String title;
    private int publishYear;
    private String genre;
    private int count;
}
