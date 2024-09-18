package Quiz;

public class QuizQuestion {
    private final String question;
    private final String answer;

    public QuizQuestion(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }


    public String getAnswer() {
        return answer;
    }


    public void Display() {
        System.out.println(question);
    }

    public boolean CheckAnswer() {
        return answer.equals("Paris");
    }
}
