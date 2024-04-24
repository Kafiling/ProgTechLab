public class NumericQuestion extends Question {
    public NumericQuestion(String text){
        super(text);
    }

    public boolean checkAnswer(String response) {
        double res = Double.parseDouble(response);
        double ans = Double.parseDouble(super.getAnswer());
        return (res <= ans+0.01 && res >= ans-0.01);
    }
}
