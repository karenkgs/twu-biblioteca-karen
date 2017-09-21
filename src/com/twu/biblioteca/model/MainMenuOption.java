package com.twu.biblioteca.model;

public enum MainMenuOption {

    QUIT_MENU(0, "Quit Menu"),
    LIST_BOOKS(1, "List Books"),
    CHECKOUT_BOOK(2, "Checkout Book"),
    RETURN_BOOK(3, "Return Book"),
    BOOK_DETAILS(4, "Book Details");

    final private int key;
    final private String value;

    MainMenuOption(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return String.format("%d - %s", getKey(), value);
    }

    @Override
    public String toString() {
        return String.valueOf(key);
    }

}
