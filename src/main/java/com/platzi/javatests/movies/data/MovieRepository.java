package com.platzi.javatests.movies.data;

import com.platzi.javatests.movies.model.Movie;

import java.util.Collection;

/**
 * Stores the movies in the database.
 */
public interface MovieRepository {

    Movie findById(long id);

    Collection<Movie> findAll();

    void saveOrUpdate(Movie movie);
}
