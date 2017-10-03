package com.twu.biblioteca.repository;

import com.twu.biblioteca.factory.UserFactory;
import com.twu.biblioteca.model.User;

import java.util.List;
import java.util.Optional;

public class UserRepository {

    List<User> userList;

    public UserRepository() {
        this.userList = UserFactory.users();
    }

    public User findUserWithLibraryNumber(String libraryNumber) {
        final Optional<User> userWithLibraryNumber = userList.stream()
                                                             .filter(user -> user.getLibraryNumber().equals(libraryNumber))
                                                             .findAny();
        return userWithLibraryNumber.orElse(null);
    }
}
