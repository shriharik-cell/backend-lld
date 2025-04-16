package com.scaler.librarymanagementsystem.books;

import com.scaler.librarymanagementsystem.users.User;

import java.awt.print.Book;

public interface Lendable {
    boolean lend(User user);
    void returnBook(User user);
    boolean isAvailable();
}
