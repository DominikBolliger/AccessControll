import ch.abbts.model.Model;

public class DistanzSensor {

    private int port;
    private String name;

    public DistanzSensor(String name, int port) {
        setPort(port);
        setName(name);
    }

    double getDistance(){
        return Model.in.getDistance(getPort());
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "This is " + name + " on Port " + port;
    }

}
