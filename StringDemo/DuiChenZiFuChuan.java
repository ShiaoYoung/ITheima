package StringDemo;

import java.util.Scanner;

public class DuiChenZiFuChuan {
    public static void main(String[] args) {
        //1. 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //2. 获取反转字符串
        String reStr = new StringBuilder().append(str).reverse().toString();

        //3. 判断
        if (reStr.equals(str)){
            System.out.println("是对称字符串。");
        }else {
            System.out.println("不是对称字符串。");
        }
    }
}
