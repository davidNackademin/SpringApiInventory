package com.example.inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<InventoryItem> inventory;

    public Inventory() {
        this.inventory = new ArrayList<>();
        addMockData();
    }

    public List<InventoryItem> getInventory(String searchString) {
        if (searchString == "")
            return inventory;

        ArrayList<InventoryItem> items = new ArrayList<>();
        for (InventoryItem item : inventory ) {
            if(item.getName().contains(searchString))
              items.add(item);
        }

        return items;
    }

    public void addItem(InventoryItem item) {
        inventory.add(item);
    }

    private void addMockData() {

        Manufacturer manufacturer = new Manufacturer("David", "www", "070-555");
        InventoryItem item = new InventoryItem("111", "sak", "1997", manufacturer);
        addItem(item);
        item = new InventoryItem("222", "sak2", "1988", manufacturer);
        addItem(item);
    }

}
