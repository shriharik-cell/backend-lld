package com.scaler.lms.users;

public abstract class User {

    private int userId;
    private String name;
    private String contactInfo;

    public User() {
        this.userId = generateUniqueId();
    }

    public User(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User other) {
        this.userId = generateUniqueId();
        this.name = other.getName();
        this.contactInfo = other.contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int generateUniqueId() {
        return 0;
    }
}
