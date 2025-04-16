package com.scaler.librarymanagementsystem.users;



public class Librarian extends User {

    private String employeeId;

    public Librarian(String name, String phone, String employeeId) {
        super(name, phone);
        this.employeeId = employeeId;
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Employee ID:" + employeeId);
    }
}
