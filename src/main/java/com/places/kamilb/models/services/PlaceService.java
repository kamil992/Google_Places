package com.places.kamilb.models.services;

import com.places.kamilb.Utils;
import com.places.kamilb.models.PlaceModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlaceService {

    public List<PlaceModel> getPlacesInfo(String city, String place){
        List<PlaceModel> placeModelList = new ArrayList<>();
        String name = null;
        String adress = null;

        String icon = null;
        double rating = 0;
        boolean isOpen;
        String googleMap = null;

        String websiteResponse = Utils.readWebsiteContent("https://maps.googleapis.com/maps/api/place/textsearch/json?query="
                + place + "+in+" + city + "&radius=1000&key=AIzaSyAgl-XHF-e-_vEwUrGTGLDfEG3AwtcFY2k");

        JSONObject jsonMainObject = new JSONObject(websiteResponse);

        JSONArray jsonArray = jsonMainObject.getJSONArray("results");

        for(int i = 0; i < jsonArray.length(); i++){

            JSONObject elementOfArray = jsonArray.getJSONObject(i);

            adress = elementOfArray.getString("formatted_address");
            icon = elementOfArray.getString("icon");
            name = elementOfArray.getString("name");

            try {
                JSONObject opening = elementOfArray.getJSONObject("opening_hours");
                isOpen = opening.getBoolean("open_now");
            }catch(JSONException e){
                isOpen = false;
            }
            try {
                rating = elementOfArray.getDouble("rating");
            }catch (JSONException e){
                rating = 0.0;
            }

            JSONArray typesArr = elementOfArray.getJSONArray("types");
            String[] types = new String[typesArr.length()];
            for(int j = 0 ; j < typesArr.length(); j++){
                types[j] = typesArr.getString(j);
            }

            PlaceModel placeModel = new PlaceModel.Builder()
                    .setName(name)
                    .setAdress(adress)
                    .setRating(rating)
                    .setOpen(isOpen)
                    .setGoogleMap("googlemap.com")
                    .setIcon("icon.jpg")
                    .setTypes(types).build();

            //if(adress.contains(city))
            System.out.println(placeModel);

            placeModelList.add(placeModel);
        }
        Collections.sort(placeModelList, (o1, o2) -> (int) (o2.getRating() - o1.getRating()));


        return placeModelList;
    }


}
