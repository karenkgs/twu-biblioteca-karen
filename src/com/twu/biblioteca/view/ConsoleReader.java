package com.twu.biblioteca.view;

import java.util.Scanner;

public class ConsoleReader {

    private final Scanner scanner;

    public ConsoleReader() {
        scanner = new Scanner(System.in);
    }

    public String readUserInput() {
        return scanner.nextLine();
    }
}
