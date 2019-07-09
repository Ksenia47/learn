package oop.building;

public class Main {

    public static void main(String[] args) {

        Building firstBuilding = new Building();
        firstBuilding.address = "Privalova, 17";
        firstBuilding.owner = "Utkin Petr";
        firstBuilding.square = 46;

        String buildingInfo = firstBuilding.getInfo();
        System.out.println(buildingInfo);
        String priceInfo = "Price " + firstBuilding.getPrice(53.2);
        System.out.println(priceInfo);
    }
}

