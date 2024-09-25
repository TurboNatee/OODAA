package Zoo;

public class Bird extends Animal implements Flyable {

    public Bird(int age, char gender, int weight) {
        super(age, gender, weight);
    }
    public void fly()
    {
        System.out.println("Bird flying");
    }
}
