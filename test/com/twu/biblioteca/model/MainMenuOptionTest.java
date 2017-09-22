package com.twu.biblioteca.model;

import com.twu.biblioteca.view.MainMenuList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MainMenuOptionTest {

    @Test
    public void testOptionValue() {

        final MainMenuOption mainMenuOption = MainMenuOption.LIST_BOOKS;

        assertThat(mainMenuOption.getKey(), equalTo(1));
        assertThat(mainMenuOption.getValue(), equalTo("1 - List Books"));
    }

    @Test
    public void testMenuOptionForKey(){

        assertThat(MainMenuOption.getOptionForKey(1), equalTo(MainMenuOption.LIST_BOOKS));
    }
}
