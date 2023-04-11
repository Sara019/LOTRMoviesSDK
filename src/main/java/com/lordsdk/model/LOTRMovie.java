package com.lordsdk.model;

import com.google.gson.annotations.SerializedName;

/**
 * Movie Entity
 */
public class LOTRMovie {
    @SerializedName("_id")
    private String movieId;
    private String name;
    private float runtimeInMinutes;
    private float budgetInMillions;
    private float boxOfficeRevenueInMillions;
    private float academyAwardNominations;
    private float academyAwardWins;
    private float rottenTomatoesScore;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public void setRuntimeInMinutes(Float runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }

    public Float getBudgetInMillions() {
        return budgetInMillions;
    }

    public void setBudgetInMillions(Float budgetInMillions) {
        this.budgetInMillions = budgetInMillions;
    }

    public Float getBoxOfficeRevenueInMillions() {
        return boxOfficeRevenueInMillions;
    }

    public void setBoxOfficeRevenueInMillions(Float boxOfficeRevenueInMillions) {
        this.boxOfficeRevenueInMillions = boxOfficeRevenueInMillions;
    }

    public Float getAcademyAwardNominations() {
        return academyAwardNominations;
    }

    public void setAcademyAwardNominations(Float academyAwardNominations) {
        this.academyAwardNominations = academyAwardNominations;
    }

    public Float getAcademyAwardWins() {
        return academyAwardWins;
    }

    public void setAcademyAwardWins(Float academyAwardWins) {
        this.academyAwardWins = academyAwardWins;
    }

    public Float getRottenTomatoesScore() {
        return rottenTomatoesScore;
    }

    public void setRottenTomatoesScore(Float rottenTomatoesScore) {
        this.rottenTomatoesScore = rottenTomatoesScore;
    }

}
