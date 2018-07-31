package com.places.kamilb.models;

import java.util.Arrays;

public class PlaceModel {

    private String name;
    private String adress;
    private String[] types;
    private String icon;
    private double rating;
    private boolean isOpen;
    private String googleMap;

    public PlaceModel(Builder builder){
        this.name = builder.name;
        this.adress = builder.adress;
        this.types = builder.types;
        this.icon = builder.icon;
        this.rating = builder.rating;
        this.isOpen = builder.isOpen;
        this.googleMap = builder.googleMap;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getGoogleMap() {
        return googleMap;
    }

    public void setGoogleMap(String googleMap) {
        this.googleMap = googleMap;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "\n----------------------------------------------------------------------------------------------------" +
                "\nName='" + name + "\n" +
                "Adress='" + adress + "\n" +
                "Types=" + Arrays.toString(types) + "\n" +
                "Icon='" + icon + "\n" +
                "Rating=" + rating + "\n"+
                "Open=" + isOpen + "\n" +
                "Google Map='" + googleMap  ;
    }



    public static class Builder{
        private String name;
        private String adress;
        private String[] types;
        private String icon;
        private double rating;
        private boolean isOpen;
        private String googleMap;


        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getAdress() {
            return adress;
        }

        public Builder setAdress(String adress) {
            this.adress = adress;
            return this;
        }

        public String[] getTypes() {
            return types;
        }

        public Builder setTypes(String[] types) {
            this.types = types;
            return this;
        }

        public String getIcon() {
            return icon;
        }

        public Builder setIcon(String icon) {
            this.icon = icon;
            return this;
        }

        public double getRating() {
            return rating;
        }

        public Builder setRating(double rating) {
            this.rating = rating;
            return this;
        }

        public boolean isOpen() {
            return isOpen;
        }

        public Builder setOpen(boolean open) {
            isOpen = open;
            return this;
        }

        public String getGoogleMap() {
            return googleMap;
        }

        public Builder setGoogleMap(String googleMap) {
            this.googleMap = googleMap;
            return this;
        }

        public PlaceModel build(){
            return new PlaceModel(this);
        }
    }
}
