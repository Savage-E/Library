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

 /*       library.addBook(new BookModel(1, new AuthorModel(1, "Leo", "Tolsoy"), "World and Peace", 1867, "Novel", 1));
        library.addBook(new BookModel(2, new AuthorModel(1, "Leo", "Tolsoy"), "Anna Karenina", 1878, "Novel", 3));
        library.addBook(new BookModel(3, new AuthorModel(1, "Leo", "Tolsoy"), "Resurrection", 1899, "Novel", 5));

        library.addBook(new BookModel(4, new AuthorModel(2, "Fydor", "Dostoevsky"), "Crime and punishment", 1866, "Novel", 31));
        library.addBook(new BookModel(5, new AuthorModel(2, "Fydor", "Dostoevsky"), "Idiot", 1869, "Novel", 11));
        library.addBook(new BookModel(6, new AuthorModel(2, "Fydor", "Dostoevsky"), " The Brothers Karamazov", 1880, "Novel", 0));


        library.addBook(new BookModel(7, new AuthorModel(3, "Andrew", "Troelsen"), "Pro C# 2010 and the .NET 4 Platform, Fifth Edition", 2011, "Education", 1));

        library.addBook(new BookModel(9, new AuthorModel(4, "Winston", "Churchill"), "The Second World War part 1", 1948, "Biography", 4));
*/
       /* try (Writer writer = new FileWriter("library.json")) {
            gson.toJson(library, writer);
        } catch (IOException e) {
            e.printStackTrace();
       }

        try (Reader reader = new FileReader("library.json")) {
            library = gson.fromJson(reader, Library.class);

        } catch (IOException e) {
            e.printStackTrace();

        }
      */
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        for (BookModel i : library
        ) {
            if (i.getAuthor().getFirstName().equals(s)) {
                System.out.println(gson.toJson(i));
            }
        }
    }
}