package com.twu.biblioteca.model;

import java.util.UUID;

public interface Rentable {

    String getTitle();
    UUID getId();

    boolean isAvailable();
    void setIsAvailable(boolean available);

    String isAvailableToString();

}
