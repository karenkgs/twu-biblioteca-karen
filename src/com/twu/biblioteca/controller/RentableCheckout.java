package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Rentable;

public class RentableCheckout {

    public Rentable checkoutRentable(Rentable rentableToCheckout) {
        if(rentableToCheckout != null && rentableToCheckout.isAvailable()){
            rentableToCheckout.setIsAvailable(false);
            return rentableToCheckout;
        }

        return null;
    }
}
