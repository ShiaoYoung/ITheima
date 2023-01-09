package ArrayList;

import java.util.ArrayList;

public class PanDuanUserExist {
    public static void main(String[] args) {
        //1. 创建集合
        ArrayList<User> list = new ArrayList();

        //2. 添加元素
        User u1 = new User("SanJin","666666","666");
        User u2 = new User("fhy","000000","000");
        User u3 = new User("ptg","222222","222");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        //3.
        System.out.println(checkExist(list,"666666"));

    }

    public static boolean checkExist(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
