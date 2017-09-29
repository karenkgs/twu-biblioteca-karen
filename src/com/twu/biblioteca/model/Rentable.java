package com.twu.biblioteca.model;

import com.twu.biblioteca.constants.StringConstants;

import java.time.Year;

public abstract class Rentable {

    private String title;
    private Year year;
    private boolean available;

    Rentable(String title, Year year, boolean available){
        this.title = title;
        this.year = year;
        this.available = available;
    }

    public String isAvailableToString(){
        return isAvailable() ? StringConstants.PRODUCT_IS_AVAILABLE : StringConstants.PRODUCT_IS_NOT_AVAILABLE;
    }

    public String getTitle(){
        return title;
    }

    public Year getYear(){
        return year;
    }

    public boolean isAvailable(){
        return available;
    }
}
