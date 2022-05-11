import ch.abbts.model.Model;

public class Motor {
    String port, name;

    void openDor(){
        Model.out.rotateTo(port, -180);
        Model.out.setDisplay("open");
    }

    void closeDor(){
        Model.out.rotateTo(port, 0);
        Model.out.setDisplay("close");
    }

    void getDoorPos(){

    }
}
