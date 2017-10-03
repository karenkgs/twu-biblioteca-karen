package com.twu.biblioteca.factory;

import com.twu.biblioteca.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserFactory {
    public static List<User> users() {
        return new ArrayList<>(Arrays.asList(new User("Karen", "karen@k.com", "My Address",
                                                      9999989, 1234567, "123"),

                                             new User("Luiz", "luiz@l.com", "His Address",
                                                      9999979, 7890123, "1234"),

                                             new User("Pri", "pri@p.com", "Her Address",
                                                      9999969, 4321567, "12345"),

                                             new User("Ina", "ina@i.com", "Her Address",
                                                      9999959, 9054627, "123456"),

                                             new User("Aline", "aline@a.com", "Her Address",
                                                      9999949, 1010101, "12"),

                                             new User("Matheus", "matheus@m.com", "His Address",
                                                      9999939, 1111111, "1")
        ));
    }
}
