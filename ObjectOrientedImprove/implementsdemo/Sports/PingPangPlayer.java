package ObjectOrientedImprove.interfacefedemo.Sports;

public class PingPangPlayer extends Player implements LearnEnglish{

    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学乒乓球");
    }
}
