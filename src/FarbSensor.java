import ch.abbts.model.Model;

public class FarbSensor{

    private int port;
    private String name;

    public FarbSensor(String name, int port) {
        setPort(port);
        setName(name);
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
