package com.vivek.model;

public class Movie1 {
    private String id;
    private String title;
    private String thumbnail;
    private String release_date;


    public Movie1() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public Movie1(String id, String title, String thumbnail, String release_date) {
        this.id = id;
        this.title = title;
        this.thumbnail = thumbnail;
        this.release_date = release_date;
    }

    @Override
    public String toString() {
        return "Movie1{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", release_date='" + release_date + '\'' +
                '}';
    }
}
