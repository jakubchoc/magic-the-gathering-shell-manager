package com.example.magicthegatheringshellapplication.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageUris {
    private String small;
    private String normal;
    private String large;
    private String png;
    private String art_crop;
    private String border_crop;

    public void setSmall(String small) {
        this.small = small;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public void setPng(String png) {
        this.png = png;
    }

    public void setArt_crop(String art_crop) {
        this.art_crop = art_crop;
    }

    public void setBorder_crop(String border_crop) {
        this.border_crop = border_crop;
    }

    public String getSmall() {
        return small;
    }

    public String getNormal() {
        return normal;
    }

    public String getLarge() {
        return large;
    }

    public String getPng() {
        return png;
    }

    public String getArt_crop() {
        return art_crop;
    }

    public String getBorder_crop() {
        return border_crop;
    }
}
