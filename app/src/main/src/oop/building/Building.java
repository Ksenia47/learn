package oop.building;

public class Building {

    String address;
    String owner;
    double square;

    double getPrice (double costMeter) {
        double cost = costMeter * square;
        return cost;
    }

    String getInfo() {
        String info = "Address: " + address + "\nOwner: " + owner + "\nSquare: " + square;
        return info;
    }
}


