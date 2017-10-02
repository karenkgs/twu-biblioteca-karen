package com.twu.biblioteca.model;

public interface Rentable {

    boolean isAvailable();
    void setIsAvailable(boolean available);

    String isAvailableToString();

}
