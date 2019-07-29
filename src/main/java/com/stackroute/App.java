package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
        Movie mov=factory.getBean(Movie.class);
        System.out.println(mov);

    }
}
