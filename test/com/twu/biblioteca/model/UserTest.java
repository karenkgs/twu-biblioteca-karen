package com.twu.biblioteca.model;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class UserTest {


    private final User user = new User("Karen", "karen@k.com", "My Address",
                                       9999999, 1234567, "123");

    @Test
    public void testUserConstructor(){
        assertThat(user.getName(), equalTo("Karen"));
    }

    @Test
    public void testUserInformationToDisplay(){
        assertThat(user.toString(), equalTo(String.format("Name: Karen%n" +
                                                          "Email: karen@k.com%n" +
                                                          "Address: My Address%n" +
                                                          "Phone: 9999999%n")));
    }

    @Test
    public void testUserLibraryNumberFormat(){
        assertThat(user.getLibraryNumber(), equalTo("123-4567"));
    }
}
