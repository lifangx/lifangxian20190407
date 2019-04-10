package com.example.www.lifangxian20190407.bean;

public class Resultts {

    private String imageUrl;
    private String jumpUrl;
    private String rank;
    private String title;

    public Resultts(String imageUrl, String jumpUrl, String rank, String title) {
        this.imageUrl = imageUrl;
        this.jumpUrl = jumpUrl;
        this.rank = rank;
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getJumpUrl() {
        return jumpUrl;
    }

    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Resultts{" +
                "imageUrl='" + imageUrl + '\'' +
                ", jumpUrl='" + jumpUrl + '\'' +
                ", rank='" + rank + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
