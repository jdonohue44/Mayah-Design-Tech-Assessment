package com.example.model;

import java.util.List;

public class RoomDesignRequest {
    private double roomWidth;
    private double roomLength;
    private List<FurniturePlacement> furniturePlacements;

    public static class FurniturePlacement {
        private String furnitureId;
        private double x;
        private double y;

        public FurniturePlacement() {}

        public FurniturePlacement(String furnitureId, double x, double y) {
            this.furnitureId = furnitureId;
            this.x = x;
            this.y = y;
        }

        // Getters and setters ...
    }

    // Getters and setters ...
}
