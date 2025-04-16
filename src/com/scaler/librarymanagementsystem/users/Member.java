package com.scaler.librarymanagementsystem.users;

public class Member extends User {

    private int borrowedBooksCount;

    public static final int MAX_BORROW_LIMIT = 5;

    public Member(String name, String phone) {
        super(name, phone);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Borrowed books count: " + borrowedBooksCount);
    }
}
