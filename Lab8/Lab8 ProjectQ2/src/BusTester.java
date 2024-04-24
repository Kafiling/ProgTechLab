import java.util.ArrayList;

public class BusTester {
    public static void main(String[] args) {
        ArrayList<Bus> arr = new ArrayList<Bus>();
        Hybrid b1 = new Hybrid(45,1200000,Electric.HIGH_VOLTAGE,150,1);
        CNGBus b2 = new CNGBus(50,1000000,200,2);
        arr.add(b1);
        arr.add(b2);
        for(Bus b : arr){
                System.out.println("ID: "+b.getID()+"\nEmission Tier: "+((LiquidFuel)b).getEmissionTier()+"\nAccel: "+b.getAccel());
        }
    }
}
