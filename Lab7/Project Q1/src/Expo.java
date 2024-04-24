public class Expo extends Taylor{
    public Expo(int k,double x){
        super(k,x);
    }
    public double getApprox(){
        double app = 0;
        for(int i = 0; i < super.getIteration()+1;i++){
            app += Math.pow(super.getValue(),i)/super.factorial(i);
        }
        return app;
    }
    public void printValue(){
        System.out.println("Value from Math.exp() is "+Math.exp(super.getValue())+".");
        System.out.println("Approximated value is "+getApprox()+".");
    }
}
