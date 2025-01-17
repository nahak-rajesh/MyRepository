package OOPS.vehicle;

public class VehicleUse {
    public static void main(String[] args) {
//        Vehicle v = new Vehicle();
//        v.color = "Black";
//        v.setMaxSpeed(10);
//        v.print();

        Vehicle v = new Car(10,100);


        Car c = new Car(10,100);
        c.numGears = 10;
        c.color = "Black";
        c.setMaxSpeed(100);
//        c.print();
    }
}
