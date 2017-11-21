package com.twu.biblioteca.view;

import com.twu.biblioteca.model.interfaces.Rentable;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class RentableList {

    List<Rentable> rentableList;

    public RentableList(List<Rentable> rentableList) {
        this.rentableList = rentableList;
    }

    public List<String> titleList() {
        return rentableList.stream().map(Rentable::getTitle).collect(toList());
    }

    public List<String> titlePlusIsAvailableList() {
        List<String> titlePlusIsAvailableList = new ArrayList<>();

        for(final Rentable rentable: rentableList) {
            final String formattedTitlePlusIsAvailable = String.format("%s - %s", rentable.getTitle(), rentable.isAvailableToString());
            titlePlusIsAvailableList.add(formattedTitlePlusIsAvailable);
        }

        return titlePlusIsAvailableList;
    }
}
