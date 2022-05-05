import ch.abbts.model.Model;

public class FarbSensor extends EquipmentBase{
    String getColor(){
        return Model.in.getColor(port);
    }
}
