package ru.mail.library;

import java.util.ArrayList;

public class Library {

    private ArrayList<BookModel> arrayList;

    public Library() {
        this.arrayList = new ArrayList();
    }

    public void addBook(BookModel bookModel){
        arrayList.add(bookModel);
    }
}
