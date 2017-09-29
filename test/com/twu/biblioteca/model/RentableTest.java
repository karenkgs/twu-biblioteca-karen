package com.twu.biblioteca.model;

import com.twu.biblioteca.constants.StringConstants;
import org.junit.Test;

import java.time.Year;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RentableTest {

    @Test
    public void testProductIsAvailableToString(){
        Rentable rentable;// = new Rentable("", Year.now(), true);
        //assertThat(rentable.isAvailableToString(), equalTo(StringConstants.PRODUCT_IS_AVAILABLE));

    }
}
