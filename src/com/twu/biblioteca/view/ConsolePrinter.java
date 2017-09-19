package com.twu.biblioteca.view;

import static java.lang.System.out;

public class ConsolePrinter {

    public void printToConsole(final String stringToPrint){
        out.print(stringToPrint);
    }

    public void printToConsoleWithLineBreak(final String stringToPrint){
        printToConsole(String.format("%s%n", stringToPrint));
    }

}
