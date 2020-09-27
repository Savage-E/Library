package ru.mail.library;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LibraryFactory {

    private Library library;

    public LibraryFactory() {
        initLibrary();
    }

    public Library getLibrary() {
        return library;
    }

    private Library initLibrary() {
        library = new Library();
        /*
        try (Reader reader = new FileReader("src/main/resources/library.json")) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            library = gson.fromJson(reader, Library.class);
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        }
         */

        try (InputStream inputStream = getClass().getResourceAsStream("/library.json")) {

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            library = gson.fromJson(reader, Library.class);


        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }





        return library;
}

}




