package com.dvd.model;

import java.io.Serializable;

public class GameItem implements Serializable {
    private String title;
    private String year;
    private String genre;
    private String semi_genre;
    private String rating;
    private String recense;
    private String image;

    public GameItem(String title, String year, String genre, String semi_genre, String rating, String recense, String image) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.semi_genre =semi_genre;
        this.rating = rating;
        this.recense = recense;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }
    public String getSemi_genre(){return  semi_genre;}
    public String getRating(){return rating;}

    public String getRecense() {
        return recense;
    }
}
