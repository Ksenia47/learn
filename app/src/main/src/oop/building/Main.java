package oop.building;

public class Main {

    public static void main(String[] args) {

        Building firstBuilding = new Building("Privalova, 17", "Utkin Petr", 46, 53.2);

        String buildingInfo = firstBuilding.getInfo();
        System.out.println(buildingInfo);
        String priceInfo = "Price " + firstBuilding.getPrice(53.2);
        System.out.println(priceInfo);
    }
}

