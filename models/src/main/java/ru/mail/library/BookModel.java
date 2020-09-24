package ru.mail.library;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BookModel {
    private int id;
    private String title;
    private String publishYear;
    private String genre;
    private int count;
    private int authorId;
}
