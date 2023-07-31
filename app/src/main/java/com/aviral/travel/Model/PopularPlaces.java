package com.aviral.travel.Model;

public class PopularPlaces {

    private int image;

    private String city;

    private String place;

    public PopularPlaces(int image, String city, String place) {
        this.image = image;
        this.city = city;
        this.place = place;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
