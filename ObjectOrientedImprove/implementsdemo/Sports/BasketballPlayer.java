package ObjectOrientedImprove.interfacefedemo.Sports;

public class BasketballPlayer extends Player{

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学篮球");
    }
}
