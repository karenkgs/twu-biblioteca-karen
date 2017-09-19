package com.twu.biblioteca.view;

import static java.lang.System.out;

public class ConsolePrinter {

    public void printToConsole(String stringToPrint){
        out.print(stringToPrint);
    }

    public void printToConsoleWithLineBreak(String stringToPrint){
        printToConsole(String.format("%s%n", stringToPrint));
    }

}
