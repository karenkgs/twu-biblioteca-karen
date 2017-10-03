package com.twu.biblioteca.factory;

import com.twu.biblioteca.model.User;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class UserFactoryTest {

    @Test
    public void testUserFactory() {
        List<User> usersList = UserFactory.users();

        assertNotNull(usersList);
    }
}
