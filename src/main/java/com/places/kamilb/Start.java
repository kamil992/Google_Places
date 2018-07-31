package com.places.kamilb;

import com.places.kamilb.controllers.Controller;
import com.places.kamilb.models.services.PlaceService;

public class Start {
    public static void main(String[] args) {
        PlaceService placeService = new PlaceService();
//        System.out.println(placeService.getPlacesInfo("Jasło", "pizzeria"));

        new Controller().startApp();


    }
}
