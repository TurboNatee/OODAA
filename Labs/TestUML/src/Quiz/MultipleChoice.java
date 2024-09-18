package Quiz;

import java.util.ArrayList;

public class MultipleChoice extends QuizQuestion {

    ArrayList<String> options = new ArrayList<>();

    public MultipleChoice(String question, String answer, ArrayList options) {
        super(question, answer);
        this.options= options;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    @Override
    public void Display() {
        super.Display();
        for (int i =1;i<4;i++)
        {
            System.out.println("Choice" + i + ": " + options.get(i) );
        }
    }

    @Override
    public boolean CheckAnswer() {
        for(int i =0;i<options.size();i++)
        {
            if (options.get(2).equals(getAnswer()))
                return true;
        }
        return false;
    }
}
