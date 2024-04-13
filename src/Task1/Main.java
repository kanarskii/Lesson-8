package Task1;


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();
        dog.voice();
        rabbit.voice();
        tiger.voice();
        dog.eat("meat");
        dog.eat("grass");
        rabbit.eat("meat");
        rabbit.eat("grass");
        tiger.eat("meat");
        tiger.eat("grass");
    }
}
