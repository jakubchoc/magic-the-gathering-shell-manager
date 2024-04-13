package com.example.magicthegatheringshellapplication.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Preview {
    private String source;
    private String source_uri;

    public void setSource(String source) {
        this.source = source;
    }

    public void setSource_uri(String source_uri) {
        this.source_uri = source_uri;
    }

    public void setPreviewed_at(String previewed_at) {
        this.previewed_at = previewed_at;
    }

    public String getSource() {
        return source;
    }

    public String getSource_uri() {
        return source_uri;
    }

    public String getPreviewed_at() {
        return previewed_at;
    }

    private String previewed_at;
}
