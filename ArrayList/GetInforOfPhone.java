package ArrayList;

import java.util.ArrayList;

public class GetInforOfPhone {
    public static void main(String[] args) {
        //1. 创建集合
        ArrayList<Phone> list = new ArrayList<>();
        ArrayList<Phone> targets = new ArrayList<>();

        //2. 添加元素
        Phone p1 = new Phone("MI",1000);
        Phone p2 = new Phone("Huawei",3999);
        Phone p3 = new Phone("Honor",4999);
        Phone p4 = new Phone("vivo",2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        //3. 找价格低于3000元的手机
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000){
                targets.add(list.get(i));
            }
        }

        //4. 打印其信息
        if (targets.size() > 0){
            for (int i = 0; i < targets.size(); i++) {
                System.out.println(targets.get(i).getBrand() + "," + targets.get(i).getPrice());
            }
        }else {
            System.out.println("没有符合条件的品牌。");
        }

    }
}
