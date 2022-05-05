import ch.abbts.model.*;

class TouchSensor extends EquipmentBase {

    boolean isPressed(){
        while(!Model.in.isPressed(port)){
            Util.delay(100);
        }
        return true;
    }
}
