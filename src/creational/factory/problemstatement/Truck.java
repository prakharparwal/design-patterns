package creational.factory.problemstatement;

public class Truck implements TransportationVehicle {

    public void delivery(String item) {
        System.out.println(item+": Delivery through road network");
    }
}
