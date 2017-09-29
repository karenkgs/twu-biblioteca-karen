package com.twu.biblioteca.model;

import java.time.Year;

public class Movie {
    private String name;
    private Year year;
    private String director;
    private int rate;
    private boolean isAvailable;

    public Movie(String name, Year year, String director, int rate, boolean isAvailable) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rate = rate;
        this.isAvailable = isAvailable;

    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
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
    public String toString() {
        return String.format("Name: %s%n" +
                             "Director: %s%n" +
                             "Year: %s%n" +
                             "Rating: %d",
                             getName(),
                             getDirector(),
                             getYear(),
                             getRate());
    }

}
