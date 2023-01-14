package ObjectOrientedImprove.abstractdemo;

public class TestDemo {
    public static void main(String[] args) {

        Frog f = new Frog("ptg",1);
        f.eat();
        f.drink();

        Dog d = new Dog();
        d.eat();
        d.drink();

        Sheep s = new Sheep();
        s.eat();
        s.drink();
    }
}
