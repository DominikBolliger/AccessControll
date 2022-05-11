public class AccessControlProject {
    public static void main(String[] args) {

        TouchSensor ts1 = new TouchSensor();
        ts1.name = "Taste 3";
        ts1.port = 3;

        TouchSensor ts2 = new TouchSensor();
        ts2.name = "Taste 2";
        ts2.port = 4;

        DistanzSensor ds1 = new DistanzSensor();
        ds1.name = "Distanz Sensor 1";
        ds1.port = 1;

        FarbSensor fs1 = new FarbSensor();
        fs1.name = "Farb Sensor 1";
        fs1.port = 2;

        Motor m1 = new Motor();
        m1.name = "Motor 1";
        m1.port = "A";

        while(true){
            if (ts1.isPressed()){
                m1.openDor();
            }
            if (ts2.isPressed()){
                m1.closeDor();
            }
        }
    }
}
