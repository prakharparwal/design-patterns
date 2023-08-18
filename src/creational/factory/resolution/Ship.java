package creational.factory.resolution;

public class Ship implements TransportationVehicle {

    public void delivery(String item) {
        System.out.println(item+": Delivered through sea route");
    }
}
