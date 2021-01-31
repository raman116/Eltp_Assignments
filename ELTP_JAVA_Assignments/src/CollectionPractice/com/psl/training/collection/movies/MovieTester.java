package com.psl.training.collection.movies;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieTester  {
    public static void main(String[] args) {
        List<Movies> list = createMovieList();
        Collections.sort(list);
        for (Movies movie: list)
        {
            System.out.println(movie);
        }
    }
    public static List<Movies> createMovieList()
    {
        List<Movies> movies = new ArrayList<>();
        movies.add(new Movies("3 idiots","Hindi", LocalDate.now().plusMonths(3),"Rajkumar","kk","3.5 HOUR"));
        movies.add(new Movies("Starwars","English", LocalDate.now().plusMonths(2),"JK","kk","5 HOUR"));
        movies.add(new Movies("Harry potter","English", LocalDate.now(),"JK Rowling","kk","3 HOUR"));
        movies.add(new Movies("Chak de india","Hindi",LocalDate.now().minusMonths(4),"Kb","kk","2 HOUR"));
        movies.add(new Movies("Don","Tamil", LocalDate.now(),"ven","kk","1 HOUR"));
        return movies;
    }
}
