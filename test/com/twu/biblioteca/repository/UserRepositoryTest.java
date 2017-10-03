package com.twu.biblioteca.repository;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class UserRepositoryTest {
    @Test
    public void testUserLibraryNumberSearch() {

        UserRepository userRepository = new UserRepository();

        assertNotNull(userRepository.findUserWithLibraryNumber("123-4567"));
        assertNull(userRepository.findUserWithLibraryNumber("000-0000"));
    }
}
