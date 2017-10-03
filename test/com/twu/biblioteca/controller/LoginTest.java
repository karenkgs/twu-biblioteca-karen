package com.twu.biblioteca.controller;

import com.twu.biblioteca.factory.UserFactory;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LoginTest {

    private User userToLogin;
    private String password;
    private Login login;

    @Before
    public void setUp() throws Exception {
        userToLogin = UserFactory.users().get(0);
        password = "123";
        login = new Login(new UserRepository());
    }

    @Test
    public void testLoginPasswordValidation() {
        assertTrue(login.validateUserPassword(userToLogin, password));
    }

    @Test
    public void testUserLogin() {
        assertTrue(login.loginUser(userToLogin.getLibraryNumber(), password));
    }

}
