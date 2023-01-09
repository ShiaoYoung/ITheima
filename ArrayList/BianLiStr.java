package ArrayList;

import java.util.ArrayList;

public class BianLiStr {
    public static void main(String[] args) {
        //1. 定义一个集合
        ArrayList<String> list = new ArrayList<>();

        //2. 添加字符串
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //3. 遍历
        //自行遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1){
                System.out.println(list.get(i) + "]");
            }else {
                System.out.print(list.get(i) + ", ");
            }
        }

        //利用toString方法遍历
        System.out.println(list);
    }
}
