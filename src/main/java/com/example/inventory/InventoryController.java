package com.example.inventory;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {

    Inventory inventory = new Inventory();

    @RequestMapping(value = "/inventory" , method = RequestMethod.GET)
    public List<InventoryItem> getInventoryItems(@RequestParam(value="searchstring", defaultValue = "") String searchString) {

        return inventory.getInventory(searchString);
    }

    @RequestMapping(value = "/inventory" , method = RequestMethod.POST)
    public InventoryItem postInventoryItem(@RequestBody InventoryItem item) {

        inventory.addItem(item);
        return item;
    }

}
