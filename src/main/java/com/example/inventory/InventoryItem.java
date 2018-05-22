package com.example.inventory;

public class InventoryItem {

    private String id;
    private String name;
    private String releaseDate;
    private Manufacturer manufacturer;

    public InventoryItem() {
    }

    public InventoryItem(String id, String name, String releaseDate, Manufacturer manufacturer) {

        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.manufacturer = manufacturer;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
