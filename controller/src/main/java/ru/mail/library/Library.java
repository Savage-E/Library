package ru.mail.library;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;

public class Library implements Iterable<BookModel> {

    private final ArrayList<BookModel> arrayList;

    public Library() {
        arrayList = new ArrayList();
    }

    private void addBook(BookModel bookModel) {
        arrayList.add(bookModel);
    }

    @NotNull
    @Override
    public Iterator<BookModel> iterator() {
      return   arrayList.iterator();
    }
}
