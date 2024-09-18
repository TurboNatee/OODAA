package Quiz;

import java.util.ArrayList;

public class QuizDriver {
    public static void main(String[] args) {
       // QuizQuestion Q1 = new QuizQuestion("What is the capital of France", "Paris");
        //Q1.Display();
        //System.out.println("Your Answer was: " +Q1.getAnswer() + "\nYour Answer Was "+Q1.CheckAnswer());
        ArrayList<String> List = new ArrayList<>();
        List.add("Brussels");
        List.add("Cork");
        List.add("Paris");
        List.add("London");
        MultipleChoice M1 = new MultipleChoice("What is the capital of France","Paris",List);
        M1.Display();
        System.out.println("Your Answer was: " +M1.getAnswer() + "\nYour Answer Was "+M1.CheckAnswer());
    }
}
