package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Movie;

import java.time.Year;

public class MovieCheckout {
    public Movie checkoutMovie(Movie movieToCheckout) {
        if(movieToCheckout != null && movieToCheckout.isAvailable()){
            movieToCheckout.setIsAvailable(false);
            return movieToCheckout;
        }

        return null;
    }
}
