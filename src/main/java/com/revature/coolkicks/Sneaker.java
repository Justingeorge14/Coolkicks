package com.revature.coolkicks;

public class Sneaker {
    //getters and setters for sneaker ID & Sneaker Name
    private int sneaker_id;
    private String sneaker_name;
    private String sneaker_brand;
    private int sneaker_size;
    private int sneaker_price;

    public int getSneaker_id() {
        return sneaker_id;
    }

    public void setSneaker_id(int sneaker_id) {
        this.sneaker_id = sneaker_id;
    }

    public String getSneaker_name() {
        return sneaker_name;
    }

    public void setSneaker_name(String sneaker_name) {
        this.sneaker_name = sneaker_name;
    }

    public String getSneaker_brand() {
        return sneaker_brand;
    }

    public void setSneaker_brand(String sneaker_brand) {
        this.sneaker_brand = sneaker_brand;
    }

    public int getSneaker_size() {
        return sneaker_size;
    }

    public void setSneaker_size(int sneaker_size) {
        this.sneaker_size = sneaker_size;
    }

    public int getSneaker_price() {
        return sneaker_price;
    }

    public void setSneaker_price(int sneaker_price) {
        this.sneaker_price = sneaker_price;
    }

    @Override
    public String toString() {
        return "Sneaker{" +
                "sneaker_id=" + sneaker_id +
                ", sneaker_name='" + sneaker_name + '\'' +
                ", sneaker_brand='" + sneaker_brand + '\'' +
                ", sneaker_size=" + sneaker_size +
                ", sneaker_price=" + sneaker_price +
                '}';
    }
}
