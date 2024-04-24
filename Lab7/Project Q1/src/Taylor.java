public abstract class Taylor {
    private int k;
    private double x;
    public Taylor(int k,double x){
        this.k=k; this.x=x;
    }
    public int factorial(int n){
        if (n == 0){
            return 1;
        }
        else return factorial(n-1)*n;
    }
    public int getIteration(){
        return k;
    }
    public double getValue(){
        return x;
    }
    public abstract void printValue();
    public abstract double getApprox();

}
