import ch.abbts.model.Model;

public class DistanzSensor extends EquipmentBase{
    double getDistance(){
        return Model.in.getDistance(port);
    }
}
