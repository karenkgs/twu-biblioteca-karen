package com.twu.biblioteca.model;

import com.twu.biblioteca.view.MainMenuList;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MainMenuListTest {

    @Test
    public void testMenuStringList(){
        final MainMenuList mainMenuList = new MainMenuList(Arrays.asList(MainMenuOption.values()));

        final List<String> menuStringList = mainMenuList.menuStringList();

//        assertThat(menuStringList.get(0), equalTo("0 - Quit Menu"));

    }

}
