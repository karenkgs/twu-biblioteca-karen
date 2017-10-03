package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.repository.UserRepository;

public class Login {

    public static User loggedInUser;
    public UserRepository userRepository;

    public Login(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean validateUserPassword(User userToLogin, String password) {
        return userToLogin.getPassword().equals(password);
    }

    public boolean loginUser(String userLibraryNumberToLogin, String password) {
        Login.loggedInUser = userRepository.findUserWithLibraryNumber(userLibraryNumberToLogin);
        return (loggedInUser != null && validateUserPassword(loggedInUser, password));
    }
}
