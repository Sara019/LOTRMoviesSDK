package com.lordsdk.sdkservice;

import com.google.gson.Gson;
import com.lordsdk.Constants;
import com.lordsdk.exception.MissingIdException;
import com.lordsdk.exception.MovieException;
import com.lordsdk.helper.HttpUtils;
import com.lordsdk.model.LOTRMovie;
import com.lordsdk.model.LOTRMovieDialog;
import com.lordsdk.model.LOTRMovieDialogAPIResponse;
import com.lordsdk.model.LOTRMoviesListAPIResponse;

import java.net.http.HttpResponse;
import java.util.List;

/**
 * API Client Libraries
 */
public class LOTRMovieAPIClient {
    private final Gson gson;
    private final HttpUtils httpUtils;
    private HttpResponse<String> response = null;

    LOTRMovieAPIClient() {
        httpUtils = new HttpUtils();
        gson = new Gson();
    }

    private static void validateMovieId(String movieId) {
        if (movieId == null || movieId.isBlank()) {
            throw new MissingIdException("Movie id required");
        }
    }

    /**
     * @return
     */
    public List<LOTRMovie> getMovies() {
        try {
            response = httpUtils.getHttpResponse(Constants.GET_MOVIES);
        } catch (Exception e) {
            throw new MovieException("Error retrieving movies.");
        }
        if (response != null && response.body() != null) {
            LOTRMoviesListAPIResponse movies = gson.fromJson(response.body(), LOTRMoviesListAPIResponse.class);
            if (movies != null && movies.getMoviesList() != null) {
                return movies.getMoviesList();
            }
        }
        System.out.println("No Lord of the Rings movie found!");
        return null;
    }

    /**
     * @param movieId user input to retrieve the movie's details
     * @return movie attributes of the given movieId
     */
    public LOTRMovie getMovie(String movieId) {
        validateMovieId(movieId);
        try {
            response = httpUtils.getHttpResponse(Constants.GET_MOVIES + "/" + movieId);
        } catch (Exception e) {
            throw new MovieException("Error retrieving movie.");
        }
        if (response != null && response.body() != null) {
            LOTRMoviesListAPIResponse movie = gson.fromJson(response.body(), LOTRMoviesListAPIResponse.class);
            if (movie != null && movie.getMoviesList() != null) {
                return movie.getMoviesList().get(0);
            }
        }
        System.out.println("No movie with found with given ID");
        return null;
    }

    /**
     * @param movieId ID of the movie which dialog is requested
     * @return list of Dialogs of the input movie
     */
    public List<LOTRMovieDialog> getMovieQuotes(String movieId) {
        validateMovieId(movieId);
        try {
            response = httpUtils.getHttpResponse(Constants.GET_MOVIES + "/" + movieId + "/quote");
        } catch (Exception e) {
            throw new MovieException("Error retrieving movie quotes.");
        }
        if (response != null && response.body() != null) {
            LOTRMovieDialogAPIResponse movies = gson.fromJson(response.body(), LOTRMovieDialogAPIResponse.class);
            if (movies != null && movies.getMovieDialogs() != null) {
                return movies.getMovieDialogs();
            }
        }
        System.out.println("No dialogs of specified movie is found.");
        return null;
    }

}


