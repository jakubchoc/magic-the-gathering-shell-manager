package com.example.magicthegatheringshellapplication.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Autocomplete {

    private String object;
    private Integer total_values;
    private List<String> data;

    public void setObject(String object) {
        this.object = object;
    }

    public void setTotal_values(Integer total_values) {
        this.total_values = total_values;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public String getObject() {
        return object;
    }

    public Integer getTotal_values() {
        return total_values;
    }

    public List<String> getData() {
        return data;
    }

    public Map<Integer, String> getDataMap() {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < data.size(); i++) {
            map.put(i + 1, data.get(i));
        }
        return map;
    }
}
