package oop.building;

public class Building {

    public Building (String address, double square) {
        this.address = address;
        this.square = square;
    }

    public Building (){

    }

    public Building (String address, String owner, double square, double costMeter) {
        this.address = address;
        this.owner = owner;
        this.square = square;
        this.costMeter = costMeter;
    }

    String address;
    String owner;
    double square;
    double costMeter;

    double getPrice (double costMeter) {
        double cost = costMeter * square;
        return cost;
    }

    String getInfo() {
        String info = "Address: " + address + "\nOwner: " + owner + "\nSquare: " + square;
        return info;
    }
}


