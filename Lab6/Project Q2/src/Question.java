public class Question {
    private String text;
    private String answer;
    public Question(String text){
        this.text = text;
    }
    public Question(){}

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public String getText() {
        return text;
    }
    public boolean checkAnswer(String response){
        return response.equals(answer);
    }
    public void display(){
        System.out.println(text);
    }
}
