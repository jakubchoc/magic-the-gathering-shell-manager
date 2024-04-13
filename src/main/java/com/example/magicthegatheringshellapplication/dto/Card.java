package com.example.magicthegatheringshellapplication.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Card {
    private String object;
    private String id;
    private String oracle_id;
    private List<Integer> multiverse_ids;
    private int mtgo_id;
    private int arena_id;
    private int tcgplayer_id;
    private int cardmarket_id;
    private String name;
    private String lang;
    private String released_at;
    private String uri;
    private String scryfall_uri;
    private String layout;
    private boolean highres_image;
    private String image_status;
    private ImageUris image_uris;
    private String mana_cost;
    private int cmc;
    private String type_line;
    private String oracle_text;
    private String power;
    private String toughness;
    private List<String> colors;
    private List<String> color_identity;
    private List<String> keywords;
    private Map<String, String> legalities;
    private List<String> games;
    private boolean reserved;
    private boolean foil;
    private boolean nonfoil;
    private List<String> finishes;
    private boolean oversized;
    private boolean promo;
    private boolean reprint;
    private boolean variation;
    private String set_id;
    private String set;
    private String set_name;
    private String set_type;
    private String set_uri;
    private String set_search_uri;
    private String scryfall_set_uri;
    private String rulings_uri;
    private String prints_search_uri;
    private String collector_number;
    private boolean digital;
    private String rarity;
    private String flavor_text;
    private String card_back_id;
    private String artist;
    private List<String> artist_ids;
    private String illustration_id;
    private String border_color;
    private String frame;
    private String security_stamp;
    private boolean full_art;
    private boolean textless;
    private boolean booster;
    private boolean story_spotlight;
    private int edhrec_rank;
    private Preview preview;
    private Prices prices;
    private RelatedUris related_uris;
    private PurchaseUris purchase_uris;

    public void setObject(String object) {
        this.object = object;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOracle_id(String oracle_id) {
        this.oracle_id = oracle_id;
    }

    public void setMultiverse_ids(List<Integer> multiverse_ids) {
        this.multiverse_ids = multiverse_ids;
    }

    public void setMtgo_id(int mtgo_id) {
        this.mtgo_id = mtgo_id;
    }

    public void setArena_id(int arena_id) {
        this.arena_id = arena_id;
    }

    public void setTcgplayer_id(int tcgplayer_id) {
        this.tcgplayer_id = tcgplayer_id;
    }

    public void setCardmarket_id(int cardmarket_id) {
        this.cardmarket_id = cardmarket_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setReleased_at(String released_at) {
        this.released_at = released_at;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setScryfall_uri(String scryfall_uri) {
        this.scryfall_uri = scryfall_uri;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public void setHighres_image(boolean highres_image) {
        this.highres_image = highres_image;
    }

    public void setImage_status(String image_status) {
        this.image_status = image_status;
    }

    public void setImage_uris(ImageUris image_uris) {
        this.image_uris = image_uris;
    }

    public void setMana_cost(String mana_cost) {
        this.mana_cost = mana_cost;
    }

    public void setCmc(int cmc) {
        this.cmc = cmc;
    }

    public void setType_line(String type_line) {
        this.type_line = type_line;
    }

    public void setOracle_text(String oracle_text) {
        this.oracle_text = oracle_text;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public void setColor_identity(List<String> color_identity) {
        this.color_identity = color_identity;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public void setLegalities(Map<String, String> legalities) {
        this.legalities = legalities;
    }

    public void setGames(List<String> games) {
        this.games = games;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public void setFoil(boolean foil) {
        this.foil = foil;
    }

    public void setNonfoil(boolean nonfoil) {
        this.nonfoil = nonfoil;
    }

    public void setFinishes(List<String> finishes) {
        this.finishes = finishes;
    }

    public void setOversized(boolean oversized) {
        this.oversized = oversized;
    }

    public void setPromo(boolean promo) {
        this.promo = promo;
    }

    public void setReprint(boolean reprint) {
        this.reprint = reprint;
    }

    public void setVariation(boolean variation) {
        this.variation = variation;
    }

    public void setSet_id(String set_id) {
        this.set_id = set_id;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public void setSet_name(String set_name) {
        this.set_name = set_name;
    }

    public void setSet_type(String set_type) {
        this.set_type = set_type;
    }

    public void setSet_uri(String set_uri) {
        this.set_uri = set_uri;
    }

    public void setSet_search_uri(String set_search_uri) {
        this.set_search_uri = set_search_uri;
    }

    public void setScryfall_set_uri(String scryfall_set_uri) {
        this.scryfall_set_uri = scryfall_set_uri;
    }

    public void setRulings_uri(String rulings_uri) {
        this.rulings_uri = rulings_uri;
    }

    public void setPrints_search_uri(String prints_search_uri) {
        this.prints_search_uri = prints_search_uri;
    }

    public void setCollector_number(String collector_number) {
        this.collector_number = collector_number;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public void setFlavor_text(String flavor_text) {
        this.flavor_text = flavor_text;
    }

    public void setCard_back_id(String card_back_id) {
        this.card_back_id = card_back_id;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setArtist_ids(List<String> artist_ids) {
        this.artist_ids = artist_ids;
    }

    public void setIllustration_id(String illustration_id) {
        this.illustration_id = illustration_id;
    }

    public void setBorder_color(String border_color) {
        this.border_color = border_color;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public void setSecurity_stamp(String security_stamp) {
        this.security_stamp = security_stamp;
    }

    public void setFull_art(boolean full_art) {
        this.full_art = full_art;
    }

    public void setTextless(boolean textless) {
        this.textless = textless;
    }

    public void setBooster(boolean booster) {
        this.booster = booster;
    }

    public void setStory_spotlight(boolean story_spotlight) {
        this.story_spotlight = story_spotlight;
    }

    public void setEdhrec_rank(int edhrec_rank) {
        this.edhrec_rank = edhrec_rank;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public void setPrices(Prices prices) {
        this.prices = prices;
    }

    public void setRelated_uris(RelatedUris related_uris) {
        this.related_uris = related_uris;
    }

    public void setPurchase_uris(PurchaseUris purchase_uris) {
        this.purchase_uris = purchase_uris;
    }

    public String getObject() {
        return object;
    }

    public String getId() {
        return id;
    }

    public String getOracle_id() {
        return oracle_id;
    }

    public List<Integer> getMultiverse_ids() {
        return multiverse_ids;
    }

    public int getMtgo_id() {
        return mtgo_id;
    }

    public int getArena_id() {
        return arena_id;
    }

    public int getTcgplayer_id() {
        return tcgplayer_id;
    }

    public int getCardmarket_id() {
        return cardmarket_id;
    }

    public String getName() {
        return name;
    }

    public String getLang() {
        return lang;
    }

    public String getReleased_at() {
        return released_at;
    }

    public String getUri() {
        return uri;
    }

    public String getScryfall_uri() {
        return scryfall_uri;
    }

    public String getLayout() {
        return layout;
    }

    public boolean isHighres_image() {
        return highres_image;
    }

    public String getImage_status() {
        return image_status;
    }

    public ImageUris getImage_uris() {
        return image_uris;
    }

    public String getMana_cost() {
        return mana_cost;
    }

    public int getCmc() {
        return cmc;
    }

    public String getType_line() {
        return type_line;
    }

    public String getOracle_text() {
        return oracle_text;
    }

    public String getPower() {
        return power;
    }

    public String getToughness() {
        return toughness;
    }

    public List<String> getColors() {
        return colors;
    }

    public List<String> getColor_identity() {
        return color_identity;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public Map<String, String> getLegalities() {
        return legalities;
    }

    public List<String> getGames() {
        return games;
    }

    public boolean isReserved() {
        return reserved;
    }

    public boolean isFoil() {
        return foil;
    }

    public boolean isNonfoil() {
        return nonfoil;
    }

    public List<String> getFinishes() {
        return finishes;
    }

    public boolean isOversized() {
        return oversized;
    }

    public boolean isPromo() {
        return promo;
    }

    public boolean isReprint() {
        return reprint;
    }

    public boolean isVariation() {
        return variation;
    }

    public String getSet_id() {
        return set_id;
    }

    public String getSet() {
        return set;
    }

    public String getSet_name() {
        return set_name;
    }

    public String getSet_type() {
        return set_type;
    }

    public String getSet_uri() {
        return set_uri;
    }

    public String getSet_search_uri() {
        return set_search_uri;
    }

    public String getScryfall_set_uri() {
        return scryfall_set_uri;
    }

    public String getRulings_uri() {
        return rulings_uri;
    }

    public String getPrints_search_uri() {
        return prints_search_uri;
    }

    public String getCollector_number() {
        return collector_number;
    }

    public boolean isDigital() {
        return digital;
    }

    public String getRarity() {
        return rarity;
    }

    public String getFlavor_text() {
        if (flavor_text == null) {
            return "null";
        }
        return flavor_text;
    }

    public String getCard_back_id() {
        return card_back_id;
    }

    public String getArtist() {
        return artist;
    }

    public List<String> getArtist_ids() {
        return artist_ids;
    }

    public String getIllustration_id() {
        return illustration_id;
    }

    public String getBorder_color() {
        return border_color;
    }

    public String getFrame() {
        return frame;
    }

    public String getSecurity_stamp() {
        return security_stamp;
    }

    public boolean isFull_art() {
        return full_art;
    }

    public boolean isTextless() {
        return textless;
    }

    public boolean isBooster() {
        return booster;
    }

    public boolean isStory_spotlight() {
        return story_spotlight;
    }

    public int getEdhrec_rank() {
        return edhrec_rank;
    }

    public Preview getPreview() {
        return preview;
    }

    public Prices getPrices() {
        return prices;
    }

    public RelatedUris getRelated_uris() {
        return related_uris;
    }

    public PurchaseUris getPurchase_uris() {
        return purchase_uris;
    }
}
