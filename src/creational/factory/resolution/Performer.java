package creational.factory.resolution;

public class Performer {

    public static void main(String[] args) {

        new LogisticAppFactory()
                .getTransportationVehicle(TransportationMode.LAND, DeliveryType.INTER_CITY)
                .delivery("Parcel");

        new LogisticAppFactory()
                .getTransportationVehicle(TransportationMode.LAND, DeliveryType.WITHIN_CITY)
                .delivery("Television");

        TransportationVehicle ship = new LogisticAppFactory()
                .getTransportationVehicle(TransportationMode.SEA, DeliveryType.OVERSEAS);
        ship.delivery("Vessel");
    }
}
