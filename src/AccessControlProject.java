import ch.abbts.model.Model;

public class AccessControlProject {
    public static void main(String[] args) {

        TouchSensor ts1 = new TouchSensor();
        ts1.name = "Taste 1";
        ts1.port = 3;

        TouchSensor ts2 = new TouchSensor();
        ts2.name = "Taste 2";
        ts2.port = 4;

        DistanzSensor ds1 = new DistanzSensor();
        ds1.name = "Sensor 1";
        ds1.port = 1;

        FarbSensor fs1 = new FarbSensor();
        fs1.name = "Sensor 1";
        fs1.port = 2;

        Motor mot1 = new Motor();
        mot1.name = "Motor 1";
        mot1.port = "A";

        while (true){

            while (!ts1.isPressed()){

            }
            mot1.openDor();

            while (!ts2.isPressed()){

            }
            mot1.closeDor();

        }
    }
}
