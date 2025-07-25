package com.example.service;

import com.example.model.*;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Override
    public boolean canFit(double roomWidth, double roomLength, double furnitureWidth, double furnitureLength) {
        // Allow rotation
        return (furnitureWidth <= roomWidth && furnitureLength <= roomLength)
            || (furnitureLength <= roomWidth && furnitureWidth <= roomLength);
    }

    @Override
    public List<FurnitureItem> getFurnitureCatalog() {
        return List.of(
            new FurnitureItem("chair-2", "Chair 2", 28, 28, 20, "chair", "/static/furniture/chair-2.png"),
            new FurnitureItem("chair", "Chair", 26, 26, 20, "chair", "/static/furniture/chair.png"),
            new FurnitureItem("floor-lamp", "Floor Lamp", 15, 15, 60, "lamp", "/static/furniture/floor-lamp.png"),
            new FurnitureItem("lamp", "Lamp", 12, 12, 18, "lamp", "/static/furniture/lamp.png"),
            new FurnitureItem("side-table", "Side Table", 20, 20, 22, "table", "/static/furniture/side-table.png"),
            new FurnitureItem("sofa-1", "Sofa 1", 80, 35, 30, "sofa", "/static/furniture/sofa-1.png"),
            new FurnitureItem("sofa-2", "Sofa 2", 72, 32, 40, "sofa", "/static/furniture/sofa-2.png"),
            new FurnitureItem("sofa-3", "Sofa 3", 90, 62, 50, "sofa", "/static/furniture/sofa-3.png"),
            new FurnitureItem("coffee-table", "Coffee Table", 72, 62, 50, "table", "/static/furniture/coffee-table.png")
            );
    }

    @Override
    public RoomDesignResponse designRoomLayout(RoomDesignRequest request) {
        // Placeholder logic: accept everything
        return new RoomDesignResponse(true, "Furniture fits the room!", null);
    }
}
