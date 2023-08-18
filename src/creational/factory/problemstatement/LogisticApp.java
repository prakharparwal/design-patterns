package creational.factory.problemstatement;

public class LogisticApp {

    public void transport(String item, TransportationMode mode) {

        //Unrefined
      /*  if(mode == TransportationMode.LAND) {
            Truck t = new Truck();
            t.delivery(item);
        }
        else
        {
            Ship s = new Ship();
            s.delivery(item);
        }
*/

        //Refinement 1

        TransportationVehicle transportationVehicle;
        if(mode == TransportationMode.LAND)
            transportationVehicle = new Truck();
        else
            transportationVehicle = new Ship();

        transportationVehicle.delivery(item);

//

    }
}
