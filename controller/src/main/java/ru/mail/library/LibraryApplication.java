package ru.mail.library;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LibraryApplication {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите имя автора:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        LibraryFactory libraryFactory = new LibraryFactory();
        var library = libraryFactory.getLibrary();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        for (BookModel i : library
        ) {
            if (i.getAuthor().getFirstName().equals(s)) {
                System.out.println(gson.toJson(i));
            }
        }
    }
}