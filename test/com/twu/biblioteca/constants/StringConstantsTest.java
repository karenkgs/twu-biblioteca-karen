package com.twu.biblioteca.constants;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class StringConstantsTest {
    @Test
    public void testIfWelcomeMessageExists(){
        String welcomeMessage = StringConstants.WELCOME_MESSAGE;

        assertNotNull(welcomeMessage);
    }
}
