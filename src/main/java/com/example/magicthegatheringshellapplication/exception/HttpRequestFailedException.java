package com.example.magicthegatheringshellapplication.exception;

public class HttpRequestFailedException extends RuntimeException {
    public HttpRequestFailedException(String message, Throwable error) {
        super(message, error);
    }
}
