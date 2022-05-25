public class AccessControlProject {
    public static void main(String[] args) {

        TouchSensor ts1 = new TouchSensor("Taste 3", 3);

        TouchSensor ts2 = new TouchSensor("Taste 2", 4);

        DistanzSensor ds1 = new DistanzSensor("Distanz Sensor 1", 1);

        FarbSensor fs1 = new FarbSensor("Farb Sensor 1", 2);

        Motor m1 = new Motor("Motor 1", "A");

        System.out.println(ts1);

//        while(true){
//            System.out.println(ds1.getDistance());
//            if (ds1.getDistance() < 0.25) {
//                m1.openDor();
//            } else if(fs1.getColor().equals("rot")){
//                m1.closeDor();
//            }
//        }
    }
}
