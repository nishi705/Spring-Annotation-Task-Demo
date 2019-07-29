package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class AppConfig
{
    @Bean
    public Actor getActor()
    {
        Actor actor=new Actor(22,"nishi","Female");
        return actor;

    }
    @Bean
    public Actor getActor1()
    {
        Actor actor=new Actor(22,"priya","Female");
        return actor;

    }
    @Bean
    public Movie getMovie()
    {
        List<Actor> list=new ArrayList<>();
        list.add(getActor());
        list.add(getActor1());
        Movie movie=new Movie(list);
        return movie;

    }
}
