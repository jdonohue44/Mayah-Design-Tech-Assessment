package com.example.service;

import com.example.model.FurnitureItem;
import com.example.model.RoomDesignRequest;
import com.example.model.RoomDesignResponse;

import java.util.List;

public interface RoomService {
    boolean canFit(double roomWidth, double roomLength, double furnitureWidth, double furnitureLength);
    RoomDesignResponse designRoomLayout(RoomDesignRequest request);
    List<FurnitureItem> getFurnitureCatalog();
}
