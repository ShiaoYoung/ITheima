package ObjectOriented;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] goods = new Goods[3];

        Goods g1 = new Goods("001","ptg",666.66,1);
        Goods g2 = new Goods("002","ptg",666.66,1);
        Goods g3 = new Goods("003","ptg",666.66,1);

        goods[0] = g1;
        goods[1] = g2;
        goods[2] = g3;

        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i].getId() + "\t" + goods[i].getName() + "\t" +goods[i].getPrice() + "\t" +goods[i].getCount());
        }
    }
}
