package Zoo;

public class Animal {
    int age;
    char gender;
    int weight;

    public Animal(int age, char gender, int weight) {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void Sleep(Animal a)
    {
        System.out.println("Animal Sleeps");
    }
    public static void Eat(Animal a)
    {
        System.out.println("Animal Eats");
    }

}
