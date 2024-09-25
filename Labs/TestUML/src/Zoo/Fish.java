package Zoo;

public class Fish extends Animal {
    public Fish(int age, char gender, int weight) {
        super(age, gender, weight);
    }
    public static void Swim(Fish b)
    {
        System.out.println("Fish Swims");
    }
    public static void Sleep(Fish a)
    {
        System.out.println("Fish Sleeps");
    }
    public static void Eat(Fish a)
    {
        System.out.println("Fish Eats");
    }
}
