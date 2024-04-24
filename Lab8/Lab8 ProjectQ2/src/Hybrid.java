public class Hybrid extends Bus implements LiquidFuel,Electric{
    private double voltage;
    private double range;
    private int emissionTier;
    public Hybrid(int capacity,double cost,double voltage,double range,int emissionTier){
        super(capacity, cost);
        if(voltage > HIGH_VOLTAGE){this.voltage = HIGH_VOLTAGE;}
        if(voltage < LOW_VOLTAGE){this.voltage = LOW_VOLTAGE;}
        this.range = range; this.emissionTier=emissionTier;
    }

    @Override
    public double getRange() {
        return range;
    }

    @Override
    public int getEmissionTier() {
        return emissionTier;
    }

    @Override
    public double getVoltage() {
        return voltage;
    }

    @Override
    public double getAccel() {
        return 4.0;
    }
}
