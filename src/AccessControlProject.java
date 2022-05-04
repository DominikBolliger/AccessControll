public class AccessControlProject {
    public static void main(String[] args) {

        TouchSensor ts1 = new TouchSensor();
        ts1.name = "Taste 1";
        ts1.port = 1;

        TouchSensor ts2 = new TouchSensor();
        ts2.name = "Taste 2";
        ts2.port = 2;

        System.out.println(ts1.name + " ist am Port " + ts1.port);
        System.out.println(ts2.name + " ist am Port " + ts2.port);

        System.out.println(ts1.isPressed());

    }
}
