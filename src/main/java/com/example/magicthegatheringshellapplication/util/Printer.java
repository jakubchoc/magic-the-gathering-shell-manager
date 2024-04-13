package com.example.magicthegatheringshellapplication.util;

import static com.example.magicthegatheringshellapplication.util.Constant.*;

public class Printer {



    public static void printGreenColor(String message) {
        System.out.println(ANSI_GREEN + message + ANSI_RESET);
    }

    public static void printYellowColor(String message) {
        System.out.println(ANSI_YELLOW + message + ANSI_RESET);
    }

    public static void printBlueColor(String message) {
        System.out.println(ANSI_BLUE + message + ANSI_RESET);
    }

    public static void printRedColor(String message) {
        System.out.println(ANSI_RED + message + ANSI_RESET);
    }
}
