import java.util.ArrayList;
import java.util.List;

public class GarageManager {
    private List<Garage> garages;
    public GarageManager() {
        this.garages = new ArrayList<Garage>();
    }
    public void addGarage(Garage garage) {
        this.garages.add(garage);
    }
    public void removeGarage(int id) {
        this.garages.removeIf(gameObject -> gameObject.getId() == id);
    }
    public Garage getGarage(int id) {
        for (Garage garage : garages) {
            if (garage.getId() == id) {
                return garage;
            }
        }
        return null;
    }
    public List<Garage> getGarages() {
        return garages;
    }
}
