package com.stackroute.domain;

import java.util.List;

public class Movie {
    Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }
//    public Movie(List<Actor> actor) {
//        this.actor = actor;
//    }

//    public Actor getActor() {
//        return actor;
//    }

//    public void setActor(Actor actor) {
//        this.actor = actor;
//    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
