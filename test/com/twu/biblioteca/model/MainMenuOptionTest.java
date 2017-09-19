package com.twu.biblioteca.model;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MainMenuOptionTest {

    @Test
    public void testOptionValue() {

        MainMenuOption mainMenuOption = MainMenuOption.LIST;

        assertThat(mainMenuOption.getKey(), equalTo(1));
        assertThat(mainMenuOption.getValue(), equalTo("1 - List Books"));
    }

}
