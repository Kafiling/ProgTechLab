public class Subject implements Evaluation{
    private String subjName;
    private int[] score;
    public Subject(String subjName,int[] score){
        this.subjName=subjName; this.score=score;
    }

    @Override
    public double evaluate() {
        int sum = 0;
        int avg = 0;
        for(int i : score){
            sum += i;
        }
        avg = sum/ score.length;
        return avg;
    }

    @Override
    public char grade(double d) {
        char c = 'F';
        if(d>=70){
            c = 'P';
        }
        return c;
    }

    @Override
    public String toString() {
        return subjName;
    }
}
