package com.vivek.model;

public class Movie2 {
    private String id;
    private String name;
    private String avatar;
    private String movie_count;

    public Movie2() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMovie_count() {
        return movie_count;
    }

    public void setMovie_count(String movie_count) {
        this.movie_count = movie_count;
    }

    public Movie2(String id, String name, String avatar, String movie_count) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.movie_count = movie_count;
    }

    @Override
    public String toString() {
        return "Movie2{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", movie_count='" + movie_count + '\'' +
                '}';
    }
}
