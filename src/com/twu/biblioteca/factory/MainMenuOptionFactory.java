package com.twu.biblioteca.factory;

import com.twu.biblioteca.model.MainMenuOption;
import com.twu.biblioteca.model.interfaces.MainMenuAction;
import com.twu.biblioteca.model.menuActions.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMenuOptionFactory {

    public static Map<Integer, MainMenuAction> mainMenuActions(){
        Map<Integer, MainMenuAction> mainMenuActionMap = new HashMap<>();

        List<Integer> keysFromEnum = MainMenuOption.keysList();

        mainMenuActionMap.put(keysFromEnum.get(0), new QuitAction());
        mainMenuActionMap.put(keysFromEnum.get(1), new ListBooksAction());
        mainMenuActionMap.put(keysFromEnum.get(2), new CheckoutBookAction());
        mainMenuActionMap.put(keysFromEnum.get(3), new ReturnBookAction());
        mainMenuActionMap.put(keysFromEnum.get(4), new BookDetailsAction());
        mainMenuActionMap.put(keysFromEnum.get(5), new ListMoviesAction());
        mainMenuActionMap.put(keysFromEnum.get(6), new CheckoutMovieAction());
        mainMenuActionMap.put(keysFromEnum.get(7), new ReturnMovieAction());
        mainMenuActionMap.put(keysFromEnum.get(8), new MovieDetailsAction());
        mainMenuActionMap.put(keysFromEnum.get(9), new UserDetailsAction());

        return  mainMenuActionMap;
    }

}
