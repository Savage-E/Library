package ru.mail.library;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;

@AllArgsConstructor
@Getter
@Setter
public class AuthorModel {
    private @NotNull int id;
    private @NotNull String firstName;
    private @NotNull String secondName;

}
