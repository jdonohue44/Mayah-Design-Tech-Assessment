package com.example.model;

public class FurnitureItem {
    private String id;
    private String name;
    private int width;
    private int length;
    private int depth;
    private String category;
    private String imageUrl;

    public FurnitureItem() {}

    public FurnitureItem(String id, String name, int width, int length, int depth, String category, String imageUrl) {
        this.id = id;
        this.name = name;
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.category = category;
        this.imageUrl = imageUrl;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    public int getLength() { return length; }
    public void setLength(int length) { this.length = length; }

    public int getDepth() { return length; }
    public void setDepth(int depth) { this.depth = depth; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

}

