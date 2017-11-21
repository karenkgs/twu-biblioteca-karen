package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.interfaces.Rentable;

public class RentableReturn {

    public Rentable returnRentable(Rentable rentableToReturn) {
        if(rentableToReturn != null && !rentableToReturn.isAvailable()) {
            rentableToReturn.setIsAvailable(true);
            return rentableToReturn;
        }

        return null;
    }
}
