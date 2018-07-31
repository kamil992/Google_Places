package com.places.kamilb.views;

public class OptionMenu {

    public void cleanConsole(int lines) {
        for (int i = 0; i < lines; i++) {
            System.out.println();
        }
    }

    public void info() {
        System.out.println("\\__________________________________________________________________________________/");
        System.out.println(" | FIND PLACES IN EVERY PLACES IN THE WORLD LIKE: shops, restaurant, museums etc. |");
        System.out.println("/----------------------------------------------------------------------------------\\");
    }

    public void showOptions() {
        System.out.println("MAIN MENU");
        System.out.println(
                "[1] Find places in choosen city.\n" +
                "[x] Exit.");
    }
}
