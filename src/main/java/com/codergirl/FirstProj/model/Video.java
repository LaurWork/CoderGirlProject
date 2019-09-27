package com.codergirl.FirstProj.model;

public class Video {

    private int id;
    private String name;
    private String webAddress;
    private String area;

    public Video(int id, String name, String webAddress, String area) {

        this.id = id;
        this.name = name;
        this.webAddress = webAddress;
        this.area = area;
    }

    @Override

    public String toString(){
        return "Video{" +
                "title='" + name + '\'' +
                "area='" + area + '\'' +
                ", webAddress='" + webAddress + '\'' +
                ", id=" + id +
                '}';
    }

    public int getId() { return id;}

    public String getWebAddress() {
        return webAddress;
    }

    public String getName() {
        return name;
    }

    public String getArea() { return area; }


}
