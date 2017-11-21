package com.twu.biblioteca.model;
import com.twu.biblioteca.constants.StringConstants;
import com.twu.biblioteca.model.interfaces.Rentable;

import java.time.Year;
import java.util.UUID;

public class Book implements Rentable {
    private final UUID id;
    private boolean isAvailable;
    private final String title;
    private final String author;
    private final Year yearPublished;

    public Book(String title, boolean isAvailable, String author, Year yearPublished) {
        this.title = title;
        this.isAvailable = isAvailable;
        this.author = author;
        this.yearPublished = yearPublished;

        this.id = UUID.randomUUID();
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearPublished() {
        return yearPublished.toString();
    }

    public UUID getId() {
        return id;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return String.format("Title: %s%n" +
                             "Author: %s%n" +
                             "Year Published: %s%n" +
                             "%s",
                             getTitle(),
                             getAuthor(),
                             getYearPublished(),
                             isAvailable() ? StringConstants.RENTABLE_IS_AVAILABLE : StringConstants.RENTABLE_IS_NOT_AVAILABLE
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() == obj.getClass()) {
            return getId() == ((Book)obj).getId();
        }

        return false;
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public String isAvailableToString() {
        return isAvailable() ? StringConstants.RENTABLE_IS_AVAILABLE : StringConstants.RENTABLE_IS_NOT_AVAILABLE;
    }
}
