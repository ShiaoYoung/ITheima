package ObjectOrientedImprove.Extends_Animal;

public class Shapy extends Dogs{

    @Override
    public void eating(){
        super.eating();
        System.out.println("吃骨头");
    }
}
