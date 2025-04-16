package com.scaler.librarymanagementsystem.users;

public abstract class User {
    private static int uniqueId;
    private String userId;
    private String name;
    private String phone;

    public User(String name, String phone) {
        uniqueId++;
        this.userId = String.valueOf(uniqueId);
        this.name = name;
        this.phone = phone;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public abstract boolean canBorrowBooks();

    public abstract void displayDashboard();
}
