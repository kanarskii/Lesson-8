package Task1;

public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("Тигр рычит");
    }

    @Override
    public void eat(String food) {
        if(MEAT.equals(food)){
            System.out.println("Тигр любит мясо");
        }else if(GRASS.equals(food)){
            System.out.println("Тигр хищник он питается мясом");
        }else{
            System.out.println("Тигр не знает что это такое и не будет это есть");
        }
    }
}
