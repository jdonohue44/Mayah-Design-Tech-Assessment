package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class RoomService {
    public boolean canFit(double roomWidth, double roomLength,
                          double furnitureWidth, double furnitureLength) {
        // TODO: implement rotation logic
        return (furnitureWidth <= roomWidth && furnitureLength <= roomLength)
            || (furnitureLength <= roomWidth && furnitureWidth <= roomLength);
    }
}
