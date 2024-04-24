public class Truck extends Car {
    private double M_weight;
    private double weight;
    public Truck(double gas, double efficiency,double M_weight,double weight){
        super(gas,efficiency);
        if(weight>M_weight){
            weight = M_weight;
        }
        this.weight = weight;
        this.M_weight = M_weight;
   }
    public void drive(double distance) {
        if(weight<1){
            super.drive(distance);
        }
        else if (weight <= 10){
            super.drive(distance*1.1);
        }
        else if (weight <= 20){
            super.drive(distance*1.2);
        }
        else{
            super.drive(distance*1.3);
        }
    }
}
