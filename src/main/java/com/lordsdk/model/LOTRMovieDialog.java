package com.lordsdk.model;

import com.google.gson.annotations.SerializedName;

/**
 * Movie Dialog Entity
 */
public class LOTRMovieDialog {
    private String id;
    private String dialog;
    @SerializedName("movie")
    private String movieId;
    @SerializedName("character")
    private String characterId;

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

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movie) {
        this.movieId = movie;
    }

    public String getCharacterId() {
        return characterId;
    }

    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }


}
