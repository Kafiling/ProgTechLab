import java.util.ArrayList;

public class ChoiceQuestion extends Question {
    private ArrayList<String> choices = new ArrayList<String>();
    public ChoiceQuestion(String text){
        super(text);
    }
    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        if(correct){
            super.setAnswer(choice);
        }
    }
    public void display(){
        System.out.println(super.getText());
        int i = 1;
        for(String choice :choices){
            System.out.println((i)+": "+choice);
            i++;
        }
    }
    public boolean checkAnswer(String response) {
        int i = Integer.parseInt(response);
        String res = choices.get(i-1);
        return super.checkAnswer(res);
    }
}
