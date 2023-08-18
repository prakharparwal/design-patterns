package creational.factory.problemstatement;

public class Ship implements TransportationVehicle{

    public void delivery(String item) {
        System.out.println(item+": Delivered through sea route");
    }
}
