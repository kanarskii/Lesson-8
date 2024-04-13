package Task1;

public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("Кролик издает звук");
    }

    @Override
    public void eat(String food) {
        if(GRASS.equals(food)){
            System.out.println("Кролик любит травку");
        }else if(MEAT.equals(food)){
            System.out.println("Кролик недоволен, он веган, он кушает только травку(");
        }else{
            System.out.println("Кролик не знает что это такое и не будет это есть");
        }
    }
}
