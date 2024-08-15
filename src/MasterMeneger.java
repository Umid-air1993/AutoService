import java.util.ArrayList;
import java.util.List;

public class MasterMeneger {
    private List<Master> masters;
    public MasterMeneger() {
        masters = new ArrayList<Master>();
    }
    public void addMaster(Master master) {
        masters.add(master);
    }
    public void removeMaster(int id) {
        masters.removeIf(master -> master.getId() == id);
    }
    public List<Master> getMasters( int id) {
        masters.removeIf(master -> master.getId() == id);
        return masters;
    }
    public List<Master> getMasters() {
        return masters;
    }
}
