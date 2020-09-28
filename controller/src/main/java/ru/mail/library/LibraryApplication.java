package ru.mail.library;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LibraryApplication {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter author name:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        LibraryFactory libraryFactory = new LibraryFactory();
        Library library = libraryFactory.getLibrary();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Boolean flag=false;
        for (BookModel i : library
        ) {
            if (i.getAuthor().getFirstName().equals(s.trim())) {
                System.out.println(gson.toJson(i));
                if (!flag)
                flag=true ;
            }
        }
        if (!flag)
        System.out.println("Author not found");
    }
}