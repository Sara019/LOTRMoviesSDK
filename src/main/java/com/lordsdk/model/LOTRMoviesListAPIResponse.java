package com.lordsdk.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * To map the response from getMovies API call
 */
public class LOTRMoviesListAPIResponse {
    private int total;
    private int limit;
    private int offset;
    private int page;
    private int pages;
    @SerializedName("docs")
    private List<LOTRMovie> moviesList;

    public List<LOTRMovie> getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(List<LOTRMovie> moviesList) {
        this.moviesList = moviesList;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


}
