package com.example.magicthegatheringshellapplication.api;

import com.example.magicthegatheringshellapplication.exception.HttpRequestFailedException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static com.example.magicthegatheringshellapplication.util.Text.scryfall_url;

public class Api {

    public <T> T getByFullPath(String path, Class<T> clazz) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(path))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<String> response;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new HttpRequestFailedException("Http request failed", e);
        }

        if (response != null && response.body() != null) {
            return mapResponse(response.body(), clazz);
        }
        throw new NullPointerException("Response body is null");
    }

    public <T> T get(String path, Class<T> clazz) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(buildUrl(path)))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<String> response;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new HttpRequestFailedException("Http request failed", e);
        }

        if (response != null && response.body() != null) {
            return mapResponse(response.body(), clazz);
        }
        throw new NullPointerException("Response body is null");
    }

    private String buildUrl(String path) {
        return scryfall_url + path;
    }

    private <T> T mapResponse(String body, Class<T> clazz) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(body, clazz);
        } catch (JsonProcessingException e) {
            throw new HttpRequestFailedException("Could not parse JSON response into " + clazz.getName() + " class", e);
        }
    }
}
