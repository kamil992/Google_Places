package com.places.kamilb.controllers;

import com.places.kamilb.models.services.PlaceService;
import com.places.kamilb.views.OptionMenu;

import java.util.Scanner;

public class Controller {
    PlaceService placeService = new PlaceService();
    OptionMenu optionMenu = new OptionMenu();


    public void startApp() {
        String city;
        String place;
        String option;
        Scanner sc = new Scanner(System.in);
        optionMenu.info();
        do {
            optionMenu.cleanConsole(2);
            optionMenu.showOptions();
            option = sc.nextLine();
            switch (option) {
                case "1":
                    System.out.println("Enter The city (city start with upper case!)");
                    System.out.print(">");
                    city = sc.nextLine();
                    System.out.println("Enter places (like restaurant, swimming pool, gym etc.)");
                    System.out.print(">");
                    place = sc.nextLine();
                    try {
                        placeService.getPlacesInfo(city, place);
                    }catch (Exception e){
                        System.out.println("Invalid data!");
                        continue;
                    }
                    //System.out.println(placeService.getPlacesInfo(city, place));
                    break;
                case "x":
                    break;

                default:
                    System.out.println("Invalid entered data");
            }

        } while (!option.equals("x"));
    }
}
