package ObjectOrientedImprove.Extends_Animal;

public class TestDemo {
    public static void main(String[] args) {
        //布偶猫
        BuOuCat a1 = new BuOuCat();
        a1.eating();
        a1.drinking();
        a1.zhuoMouse();

        System.out.println("-----布偶猫");

        //狸花猫
        LiHua a2 = new LiHua();
        a2.eating();
        a2.drinking();
        a2.zhuoMouse();

        System.out.println("-----狸花猫");

        //哈士奇
        Husky a3 = new Husky();
        a3.eating();
        a3.drinking();
        a3.chaiJia();
        a3.kanJia();

        System.out.println("-----哈士奇");

        //沙皮狗
        Shapy sp = new Shapy();
        sp.eating();
        sp.drinking();
        sp.kanJia();

        System.out.println("-----沙皮狗");


        //中华田园犬
        ChineseDog cd = new ChineseDog();
        cd.eating();
        cd.drinking();
        cd.kanJia();

        System.out.println("-----中华田园犬");


        //泰迪
        Tidy a4 = new Tidy();
        a4.eating();
        a4.drinking();
        a4.cengYiCeng();
        a3.kanJia();

        System.out.println("-----泰迪");


    }
}
