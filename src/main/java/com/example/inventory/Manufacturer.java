package com.example.inventory;

public class Manufacturer {

    private String name;
    private String homePage;
    private String phone;

    public Manufacturer() {}

    public Manufacturer(String name, String homePage, String phone) {
        this.name = name;
        this.homePage = homePage;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getHomePage() {
        return homePage;
    }

    public String getPhone() {
        return phone;
    }

}
