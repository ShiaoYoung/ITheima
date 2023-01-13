package ObjectOrientedImprove.Extends_Animal;

public class Dogs extends Animals{

    public void kanJia(){
        System.out.println("看家");
    }

    @Override
    public void eating(){
        System.out.println("吃狗粮");
    }

}
