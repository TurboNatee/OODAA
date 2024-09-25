package Zoo;

public class Driver {
    public static void main(String[] args) {
        Animal A1 =new Animal(2,'F',15);
        Animal.Sleep(A1);
        Animal.Eat(A1);
        Bird B1 =new Bird(2,'F',15);
        Bird.Sleep(B1);
        Bird.Eat(B1);
        Fish F1 =new Fish(2,'F',15);
        Fish.Sleep(F1);
        Fish.Eat(F1);
        Fish.Swim(F1);
        Chicken C1 =new Chicken(2,'F',15);
        Chicken.Sleep(C1);
        Chicken.Eat(C1);
        Chicken.Fly();
        Sparrow S1 =new Sparrow(2,'F',15);
        Sparrow.Sleep(S1);
        Sparrow.Eat(S1);
        Sparrow.fly(S1);
    }
}
