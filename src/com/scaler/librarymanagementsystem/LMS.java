package com.scaler.librarymanagementsystem;

import com.scaler.librarymanagementsystem.books.Book;
import com.scaler.librarymanagementsystem.users.User;

import java.util.ArrayList;
import java.util.List;

public class LMS {
    private List<Book> bookInventory = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
            bookInventory.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }
}
