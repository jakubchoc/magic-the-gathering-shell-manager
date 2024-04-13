package com.example.magicthegatheringshellapplication.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SetObject {
    private String set;
    private String id;
    private String code;
    private String name;
    private String uri;
    private String scryfall_uri;
    private String search_uri;
    private String released_at;
    private String set_type;
    private int card_count;
    private String parent_set_code;
    private Boolean digital;
    private Boolean nonfoil_only;
    private Boolean foil_only;
    private String icon_svg_uri;

    public void setSet(String set) {
        this.set = set;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setScryfall_uri(String scryfall_uri) {
        this.scryfall_uri = scryfall_uri;
    }

    public void setSearch_uri(String search_uri) {
        this.search_uri = search_uri;
    }

    public void setReleased_at(String released_at) {
        this.released_at = released_at;
    }

    public void setSet_type(String set_type) {
        this.set_type = set_type;
    }

    public void setCard_count(int card_count) {
        this.card_count = card_count;
    }

    public void setParent_set_code(String parent_set_code) {
        this.parent_set_code = parent_set_code;
    }

    public void setDigital(Boolean digital) {
        this.digital = digital;
    }

    public void setNonfoil_only(Boolean nonfoil_only) {
        this.nonfoil_only = nonfoil_only;
    }

    public void setFoil_only(Boolean foil_only) {
        this.foil_only = foil_only;
    }

    public void setIcon_svg_uri(String icon_svg_uri) {
        this.icon_svg_uri = icon_svg_uri;
    }

    public String getSet() {
        return set;
    }

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getUri() {
        return uri;
    }

    public String getScryfall_uri() {
        return scryfall_uri;
    }

    public String getSearch_uri() {
        return search_uri;
    }

    public String getReleased_at() {
        return released_at;
    }

    public String getSet_type() {
        return set_type;
    }

    public int getCard_count() {
        return card_count;
    }

    public String getParent_set_code() {
        return parent_set_code;
    }

    public Boolean getDigital() {
        return digital;
    }

    public Boolean getNonfoil_only() {
        return nonfoil_only;
    }

    public Boolean getFoil_only() {
        return foil_only;
    }

    public String getIcon_svg_uri() {
        return icon_svg_uri;
    }
}
