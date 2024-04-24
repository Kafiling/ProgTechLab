public class Cosine extends Taylor {
    public Cosine(int k,double x){
        super(k,x);
    }
    public double getApprox(){
        double app = 0;
        for(int i = 0; i < super.getIteration()+1;i++){
            app += Math.pow(-1,i) * Math.pow(super.getValue(),(2*i)) / super.factorial((2*i));
        }
        return app;
    }
    public void printValue(){
        System.out.println("Value from Math.cos() is "+Math.cos(super.getValue())+".");
        System.out.println("Approximated value is "+getApprox()+".");

    }
}
