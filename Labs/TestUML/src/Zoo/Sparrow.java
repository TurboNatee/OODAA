package Zoo;

public class Sparrow extends Bird implements Flyable{
    public Sparrow(int age, char gender, int weight) {
        super(age, gender, weight);
    }

    public void fly() {
        System.out.println("Sparrow flying");
    }
}
