public class CNGBus extends Bus implements LiquidFuel {
    private double range;
    private int emissionTier;
    public CNGBus(int capacity,double cost,double range,int emissionTier){
        super(capacity,cost);
        this.range = range; this.emissionTier = emissionTier;
    }

    public double getRange() {
        return range;
    }

    public int getEmissionTier() {
        return emissionTier;
    }

    @Override
    public double getAccel() {
        return 3.0;
    }
}
