package creational.factory.resolution;

public class LogisticAppFactory {

    public TransportationVehicle getTransportationVehicle(TransportationMode mode, DeliveryType deliveryType) {

        TransportationVehicle transportationVehicle;
        if (mode == TransportationMode.LAND && deliveryType == DeliveryType.INTER_CITY)
            transportationVehicle = new Truck();
        else if (mode == TransportationMode.LAND && deliveryType == DeliveryType.WITHIN_CITY)
            transportationVehicle = new MiniVan();
        else
            transportationVehicle = new Ship();

        return transportationVehicle;
    }
}
