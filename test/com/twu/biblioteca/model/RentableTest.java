package com.twu.biblioteca.model;

import com.twu.biblioteca.constants.StringConstants;
import org.junit.Test;

import java.time.Year;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RentableTest {


    Rentable rentable = new Book("", true, "", Year.now());

    @Test
    public void testRentableIsAvailableToString(){
        assertThat(rentable.isAvailableToString(), equalTo(StringConstants.RENTABLE_IS_AVAILABLE));

    }

}
