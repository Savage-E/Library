package ru.mail.library;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@AllArgsConstructor
@Getter
@Setter
public class BookModel {
    private @NotNull int id;
    private @NotNull AuthorModel author;
    private @NotNull String title;
    private @NotNull int publishYear;
    private @NotNull String genre;
    private @NotNull int amount;
}
