package com.lordoftheringsSDK.model;

import com.google.gson.annotations.SerializedName;

public class LOTRMovieDialog {
    String id;
    String dialog;
    @SerializedName("movie")
    String movieId;
    @SerializedName("character")
    String characterId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDialog() {
        return dialog;
    }

    public void setDialog(String dialog) {
        this.dialog = dialog;
    }

    public String getMovie() {
        return movieId;
    }

    public void setMovie(String movie) {
        this.movieId = movie;
    }

    public String getCharacter() {
        return characterId;
    }

    public void setCharacter(String character) {
        this.characterId = character;
    }


}
