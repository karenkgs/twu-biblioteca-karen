package com.twu.biblioteca.model;

import com.twu.biblioteca.constants.StringConstants;

import java.time.Year;
import java.util.UUID;

public class Movie implements Rentable {

    private String title;
    private Year year;
    private String director;
    private int rate;
    private UUID id;
    private boolean isAvailable;

    public Movie(String title, Year year, String director, int rate, boolean isAvailable) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.rate = rate;
        this.isAvailable = isAvailable;

        this.id = UUID.randomUUID();

    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public Year getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public int getRate() {
        return rate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Name: %s%n" +
                             "Director: %s%n" +
                             "Year: %s%n" +
                             "Rating: %d%n" +
                             "%s%n",
                             getTitle(),
                             getDirector(),
                             getYear(),
                             getRate(),
                             isAvailableToString());
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
