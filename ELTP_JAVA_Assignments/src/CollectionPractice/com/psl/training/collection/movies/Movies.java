package com.psl.training.collection.movies;

import java.time.LocalDate;

public class Movies implements Comparable<Movies> {
    private String name;
    private String language;
    private LocalDate releaseDate;
    private String director;
    private String producer;
    private String duration;

    public Movies(String name, String language, LocalDate releaseDate, String director, String producer, String duration) {
        this.name = name;
        this.language = language;
        this.releaseDate = releaseDate;
        this.director = director;
        this.producer = producer;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public int compareTo(Movies movies) {
        int i = this.language.compareTo(movies.getLanguage());
        if(i==0)
        {
            return this.releaseDate.compareTo(movies.releaseDate);
        }
        return i;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", director='" + director + '\'' +
                ", producer='" + producer + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
