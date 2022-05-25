import ch.abbts.model.*;

class TouchSensor {

    private String name;
    private int port;

    public TouchSensor(String name, int port) {
        setPort(port);
        setName(name);
    }

    public void waitForPressed() {
        while(!isPressed()) {
            Util.delay(100);
        }
    }

    private boolean isPressed(){
        return Model.in.isPressed(getPort());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String toString(){
        return "This is " + name + " on Port " + port;
    }

}
