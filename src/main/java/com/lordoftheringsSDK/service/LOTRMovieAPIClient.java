package com.lordoftheringsSDK.service;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.lordoftheringsSDK.model.LOTRMovie;
import com.lordoftheringsSDK.model.LOTRMovieDialog;
import com.lordoftheringsSDK.model.LOTRMovieDialogAPIResponse;
import com.lordoftheringsSDK.model.LOTRMoviesListAPIResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class LOTRMovieAPIClient {
    private static HttpResponse<String> getHttpResponse(String url) {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Authorization", "Bearer " + Constants.AUTH_TOKEN).GET().build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return response;
    }

    public List<LOTRMovie> getMovies() throws JsonSyntaxException, IllegalStateException {
        HttpResponse<String> response = getHttpResponse(Constants.GET_MOVIES);
        if (response != null && response.body() != null) {
            LOTRMoviesListAPIResponse movies = new Gson().fromJson(response.body(), LOTRMoviesListAPIResponse.class);
            if (movies != null) {
                return movies.getMoviesList();
            }
        }
        return null;
    }

    public LOTRMovie getMovie(String movieId) throws JsonSyntaxException, IllegalStateException {
        HttpResponse<String> response = getHttpResponse(Constants.GET_MOVIES + "/" + movieId);
        if (response != null && response.body() != null) {
            LOTRMoviesListAPIResponse movie = new Gson().fromJson(response.body(), LOTRMoviesListAPIResponse.class);
            if (movie != null) {
                return movie.getMoviesList().get(0);
            }
        }
       return null;
    }

    public List<LOTRMovieDialog> getMovieQuotes(String movieId) throws JsonSyntaxException, IllegalStateException {
        HttpResponse<String> response = getHttpResponse(Constants.GET_MOVIES + "/" + movieId + "/quote");
        if (response != null && response.body() != null) {
            LOTRMovieDialogAPIResponse movies = new Gson().fromJson(response.body(), LOTRMovieDialogAPIResponse.class);
            if(movies != null) {
                return movies.getMovieDialogs();
            }
        }
        return null;
    }
}


