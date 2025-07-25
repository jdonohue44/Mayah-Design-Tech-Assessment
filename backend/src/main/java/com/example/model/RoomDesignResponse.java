package com.example.model;

public class RoomDesignResponse {
    private boolean validLayout;
    private String message;
    private String layoutImageUrl;  // Optional for future use

    public RoomDesignResponse() {}

    public RoomDesignResponse(boolean validLayout, String message, String layoutImageUrl) {
        this.validLayout = validLayout;
        this.message = message;
        this.layoutImageUrl = layoutImageUrl;
    }

    // Getters and setters ...
}
