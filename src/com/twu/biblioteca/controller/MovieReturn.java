package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Movie;


public class MovieReturn {
    public Movie returnMovie(Movie movieToReturn) {
        if(movieToReturn != null && !movieToReturn.isAvailable()){
            movieToReturn.setIsAvailable(true);
            return movieToReturn;
        }

        return null;
    }
}
