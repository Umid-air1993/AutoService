public class Main {
    public static void main(String[] args) {
MasterMeneger masterMeneger = new MasterMeneger();
GarageManager garageManager = new GarageManager();

Master master1=new Master(1,"Ivan","wrw",true);
Master master2=new Master(2,"Petr","wrw",true);
Master master3=new Master(3,"Anna","wrw",true);
masterMeneger.addMaster(master1);
masterMeneger.addMaster(master2);
masterMeneger.addMaster(master3);

Garage garage1=new Garage(10,"Garage1",5);
Garage garage2=new Garage(20,"Garage2",1);
Garage garage3=new Garage(30,"Garage3",2);
garageManager.addGarage(garage1);
garageManager.addGarage(garage2);
garageManager.addGarage(garage3);

        System.out.println("List Masters: ");
        for (Master master : masterMeneger.getMasters()) {
            System.out.println(master.getName());
        }
        System.out.println("List Garages: ");
        for (Garage garage : garageManager.getGarages()) {
            System.out.println(garage.getName());
        }


    }
}