package com.twu.biblioteca.model;
import java.util.UUID;

public class Book {
    private UUID id;
    private boolean isAvailable;
    private final String title;

    public Book(String title, boolean isAvailable) {
        this.title = title;
        this.isAvailable = isAvailable;
        this.id = UUID.randomUUID();
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public UUID getId() {
        return id;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
