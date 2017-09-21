package com.twu.biblioteca.controller;


import com.twu.biblioteca.model.MainMenuOption;
import com.twu.biblioteca.view.MainMenuList;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MainMenuControllerTest {

    @Test
    public void testInvalidMenuOption(){
        final MainMenuList mainMenuList = new MainMenuList(Arrays.asList(MainMenuOption.LIST_BOOKS));
        final MainMenuController mainMenuController = new MainMenuController(mainMenuList);

        MainMenuOption selectedMainMenuOption = mainMenuController.selectedOption(999);
        assertThat(selectedMainMenuOption, equalTo(null));

        selectedMainMenuOption = mainMenuController.selectedOption(1);
        assertThat(selectedMainMenuOption, equalTo(MainMenuOption.LIST_BOOKS));
//        verify();
    }

}
