package com.twu.biblioteca.model;

import com.twu.biblioteca.view.MainMenuList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MainMenuListTest {

    @Test
    public void testMainMenuOptionValue() {
        final List<MainMenuOption> options = new ArrayList<>(Arrays.asList(MainMenuOption.LIST_BOOKS,
                                                        MainMenuOption.CHECKOUT_BOOK));
        final MainMenuList mainMenuList = new MainMenuList(options);

        assertThat(mainMenuList.getOptionValue(1), equalTo("1 - List Books"));
        assertThat(mainMenuList.getOptionValue(2), equalTo("2 - Checkout Book"));
    }

    @Test
    public void testMenuOptionForKey(){
        final List<MainMenuOption> options = new ArrayList<>(Arrays.asList(MainMenuOption.LIST_BOOKS,
                MainMenuOption.CHECKOUT_BOOK));
        final MainMenuList mainMenuList = new MainMenuList(options);

        assertThat(mainMenuList.getOptionForKey(1), equalTo(MainMenuOption.LIST_BOOKS));
    }

}
