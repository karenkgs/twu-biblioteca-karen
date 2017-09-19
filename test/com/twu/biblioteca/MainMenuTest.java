package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MainMenuTest {

    @Test
    public void testMainMenuOptionValue(){
        List<MainMenu.MainMenuOption> options = new ArrayList<>(Arrays.asList(new MainMenu.MainMenuOption(1, "List Books"),
                                                                              new MainMenu.MainMenuOption(2, "Checkout Book")));
        MainMenu mainMenu = new MainMenu(options);

        assertThat(mainMenu.getOptionValue(1), equalTo("1 - List Books"));
        assertThat(mainMenu.getOptionValue(2), equalTo("2 - Checkout Book"));
    }

    @Test
    public void testOptionValue(){

        MainMenu.MainMenuOption mainMenuOption = new MainMenu.MainMenuOption(1, "List Books");

        assertThat(mainMenuOption.getKey(), equalTo(1));
        assertThat(mainMenuOption.getValue(), equalTo("1 - List Books"));
    }

}
