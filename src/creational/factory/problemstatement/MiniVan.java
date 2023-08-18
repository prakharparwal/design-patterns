package creational.factory.problemstatement;

public class MiniVan implements TransportationVehicle{

    @Override
    public void delivery(String item) {
        System.out.println(item+": Delivered within city using minivan");
    }
}
