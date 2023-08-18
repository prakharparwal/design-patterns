package creational.factory.problemstatement;

public class Performer {

    public static void main(String[] args) {

        LogisticApp la = new LogisticApp();
        la.transport("Television", TransportationMode.LAND);
        la.transport("VESSEL", TransportationMode.SEA);
    }
}
