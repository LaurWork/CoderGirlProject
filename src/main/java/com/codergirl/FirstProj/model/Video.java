package com.codergirl.FirstProj.model;

public class Video {

    private String title;
    private String webAddress;

    public Video(String title, String webAddress) {
        this.title = title;
        this.webAddress = webAddress;
    }


    public String getWebAddress() {
        return webAddress;
    }

    public String getTitle() {
        return title;
    }


}
