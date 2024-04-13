package com.example.magicthegatheringshellapplication.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Set {
    private String object;
    private Boolean has_more;
    private List<SetObject> data;

    public void setObject(String object) {
        this.object = object;
    }

    public void setHas_more(Boolean has_more) {
        this.has_more = has_more;
    }

    public void setData(List<SetObject> data) {
        this.data = data;
    }

    public String getObject() {
        return object;
    }

    public Boolean getHas_more() {
        return has_more;
    }

    public List<SetObject> getData() {
        return data;
    }
}
