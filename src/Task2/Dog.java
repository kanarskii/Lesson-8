package Task2;

public class Dog {
    private String name;
    private int age;

    private Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void voice(){
        System.out.println("Собака гавкает гав-гав");
    }
    public static void eat(){
        System.out.println("Собка ест");
    }
}
