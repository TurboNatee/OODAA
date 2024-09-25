package Zoo;

public class Chicken extends Bird{
    public Chicken(int age, char gender, int weight) {
        super(age, gender, weight);
    }
    public static void Fly()
    {
        System.out.println("Chicken cannot Fly, I can only flap my Wings");
    }
}
