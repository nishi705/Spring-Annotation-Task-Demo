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
public  Actor getActor()
{
    Actor actor=new Actor();
    actor.setAge(22);
    actor.setName("nishi");
    actor.setGender("femlae");
   return  actor;
}
    @Bean
    public Movie getMovie()
    {
      Movie movie=new Movie(getActor());
      return movie;


    }
}
