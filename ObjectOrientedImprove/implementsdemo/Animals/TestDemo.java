package ObjectOrientedImprove.interfacefedemo.Animals;

public class TestDemo {
    public static void main(String[] args) {
        Frog f = new Frog();
        f.eat();
        f.swim();

        System.out.println();

        Dog d = new Dog();
        d.eat();
        d.swim();

        System.out.println();

        Rabbit r = new Rabbit();
        r.eat();
    }
}
