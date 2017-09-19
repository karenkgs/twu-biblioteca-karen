package com.twu.biblioteca.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MainMenuTest {

    @Test
    public void testMainMenuOptionValue() {
        List<MainMenuOption> options = new ArrayList<>(Arrays.asList(MainMenuOption.LIST,
                                                        MainMenuOption.CHECKOUT));
        MainMenu mainMenu = new MainMenu(options);

        assertThat(mainMenu.getOptionValue(1), equalTo("1 - List Books"));
        assertThat(mainMenu.getOptionValue(2), equalTo("2 - Checkout Book"));
    }

}
