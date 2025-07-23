package com.example.controller;

import com.example.service.RoomService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    private final RoomService service;

    public RoomController(RoomService service) {
        this.service = service;
    }

    @GetMapping("/fit")
    public boolean canFit(
        @RequestParam double roomWidth,
        @RequestParam double roomLength,
        @RequestParam double furnitureWidth,
        @RequestParam double furnitureLength
    ) {
        return service.canFit(roomWidth, roomLength, furnitureWidth, furnitureLength);
    }
}
