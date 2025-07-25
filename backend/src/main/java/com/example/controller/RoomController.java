package com.example.controller;

import com.example.model.*;

import com.example.service.RoomService;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    private final RoomService service;

    public RoomController(RoomService service) {
        this.service = service;
    }

    // TODO
    @GetMapping("/fit")
    public boolean canFit(
        @RequestParam double roomWidth,
        @RequestParam double roomLength,
        @RequestParam double furnitureWidth,
        @RequestParam double furnitureLength
    ) {
        return service.canFit(roomWidth, roomLength, furnitureWidth, furnitureLength);
    }

    // TODO
    @PostMapping("/design")
    public RoomDesignResponse designRoom(@RequestBody RoomDesignRequest request) {
        return new RoomDesignResponse();
    }

    // TODO
    @GetMapping("/furniture")
    public List<FurnitureItem> getFurnitureItems() {
        return service.getFurnitureCatalog(); // or static JSON
    }

}
