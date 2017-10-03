package com.twu.biblioteca.model;

public class User {
    private String name;
    private String email;
    private String address;
    private int phoneNumber;
    private String libraryNumber;
    private String password;

    public User(String name, String email, String address, int phoneNumber, int libraryNumber, String password) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.setLibraryNumber(libraryNumber);
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s%nEmail: %s%nAddress: %s%nPhone: %d%n", getName(), getEmail(), getAddress(), getPhoneNumber());
    }

    private void setLibraryNumber(int libraryNumber) {
        String libraryNumberString = String.valueOf(libraryNumber);
        this.libraryNumber = String.format("%s%s%s-%s%s%s%s", libraryNumberString.charAt(0),
                                                              libraryNumberString.charAt(1),
                                                              libraryNumberString.charAt(2),
                                                              libraryNumberString.charAt(3),
                                                              libraryNumberString.charAt(4),
                                                              libraryNumberString.charAt(5),
                                                              libraryNumberString.charAt(6));
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }
}
