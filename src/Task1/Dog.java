package Task1;

public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("Собака гавкает");
    }

    @Override
    public void eat(String food) {
        if(MEAT.equals(food)){
            System.out.println("Собака любит мясо омномном");
        }else if(GRASS.equals(food)){
            System.out.println("Собака кушает трову, когда нет ничего другого((");
        }else{
            System.out.println("Собака не знает что это такое но все равно съест");
        }
    }
}
