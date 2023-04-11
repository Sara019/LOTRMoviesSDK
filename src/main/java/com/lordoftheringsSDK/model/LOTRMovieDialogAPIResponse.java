package com.lordoftheringsSDK.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LOTRMovieDialogAPIResponse {
    int total;
    int limit;
    int offset;
    int page;
    int pages;
    @SerializedName("docs")
    private List<LOTRMovieDialog> movieDialogs;

    public List<LOTRMovieDialog> getMovieDialogs() {
        return movieDialogs;
    }

    public void setMovieDialogs(List<LOTRMovieDialog> movieDialog) {
        this.movieDialogs = movieDialog;
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
