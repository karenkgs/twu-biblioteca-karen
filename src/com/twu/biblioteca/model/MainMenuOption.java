package com.twu.biblioteca.model;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public enum MainMenuOption {

    QUIT_MENU(0, "Quit Menu"),
    LIST_BOOKS(1, "List Books"),
    CHECKOUT_BOOK(2, "Checkout Book"),
    RETURN_BOOK(3, "Return Book"),
    BOOK_DETAILS(4, "Book Details"),
    LIST_MOVIES(5, "List Movies"),
    CHECKOUT_MOVIE(6, "Checkout Movie"),
    RETURN_MOVIE(7, "Return Movie"),
    MOVIE_DETAILS(8, "Movie Details"),
    USER_DETAILS(9, "Show my User Account Details");

    final private int key;
    final private String value;

    MainMenuOption(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getKey(MainMenuOption mainMenuOption) {
        return mainMenuOption.getKey();
    }

    public String getValue() {
        return String.format("%d - %s", getKey(), value);
    }

    private String getValue(MainMenuOption mainMenuOption) {
        return mainMenuOption.getValue();
    }

    public static List<String> valuesList() {
        return Arrays.stream(values()).map(option -> option.getValue(option)).collect(Collectors.toList());
    }


    public static List<Integer> keysList() {
        return Arrays.stream(values()).map(option -> option.getKey(option)).collect(Collectors.toList());
    }

    public static MainMenuOption getOptionForKey(final int key) {
        final Optional<MainMenuOption> optionForKey = Arrays.stream(values())
                                                            .filter(option -> option.getKey() == key)
                                                            .findAny();

        return optionForKey.orElse(null);
    }

    @Override
    public String toString() {
        return String.valueOf(key);
    }

}
