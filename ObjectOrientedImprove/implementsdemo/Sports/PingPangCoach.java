package ObjectOrientedImprove.interfacefedemo.Sports;

public class PingPangCoach extends Coach implements LearnEnglish{

    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球");
    }


}
