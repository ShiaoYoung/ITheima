package ObjectOriented;

import ObjectOriented.WenZiGeDou;

public class GeDouTest {
    public static void main(String[] args) {
        WenZiGeDou role1 = new WenZiGeDou();
        role1.setName("fhy");
        role1.setBlood(100);
        role1.setGender('男');
        role1.setFace();

        WenZiGeDou role2 = new WenZiGeDou();
        role2.setName("ptg");
        role2.setBlood(100);
        role2.setGender('男');
        role2.setFace();

        while (true){
            role1.attack(role2);
            role2.attack(role1);
            if (role1.getBlood() == 0){
                System.out.println(role2.getName() + "赢了！");
                break;
            } else if (role2.getBlood()  == 0) {
                System.out.println(role1.getName() + "赢了！");
                break;
            }
        }


    }
}
