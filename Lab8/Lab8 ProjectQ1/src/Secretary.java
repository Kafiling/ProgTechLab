public class Secretary extends Employee implements Evaluation {
    private int typingSpeed;
    private int[] score;
    public Secretary(String name,int salary,int[] score,int typingSpeed){
        super(name,salary);
        this.score=score; this.typingSpeed=typingSpeed;
    }

    @Override
    public double evaluate() {
        int sum = 0;
        for (int i: score) {
            sum += i;
        }
        return sum;
    }

    @Override
    public char grade(double d) {
        char result = 'F';
        if(d>=90){
            result = 'P';
            setSalary(18000);
        }
        return result;
    }
}
