package com.scaler.librarymanagementsystem;

import com.scaler.librarymanagementsystem.books.NovelBook;
import com.scaler.librarymanagementsystem.books.TextBook;
import com.scaler.librarymanagementsystem.users.Member;

public class Main {
    public static void main(String[] args) {
        LMS lms = new LMS();
        lms.addBook(new TextBook("DSA", "Shrihari", "1234", "CS"));
        lms.addBook(new NovelBook("death note", "some guy", "1235", "fiction"));
        lms.addUser(new Member("Hemanth", "1234"));
        lms.addUser(new Member("shrihari", "12334"));
    }
}
