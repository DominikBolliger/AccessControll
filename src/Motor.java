import ch.abbts.model.Model;
import ch.abbts.model.Util;

public class Motor{

    private String port;
    private String name;

    public Motor(String name, String port) {
        setPort(port);
        setName(name);
    }

    void openDor(){
        Model.out.rotateTo(getPort(), -180);
        Util.delay(2500);
        Model.out.setDisplay("open");
    }

    void closeDor(){
        Model.out.rotateTo(getPort(), 0);
        Util.delay(2500);
        Model.out.setDisplay("close");
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
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
