package ru.mail.library;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Getter
@Setter
public class AuthorModel {
    private  int id;
    private  String firstName;
    private  String secondName;

}
