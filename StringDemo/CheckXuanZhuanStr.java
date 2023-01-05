package StringDemo;

import java.util.Scanner;

public class CheckXuanZhuanStr {
    public static void main(String[] args) {
        //1. 定义两个字符串
        Scanner sc = new Scanner(System.in);
        String A = "abcdefghijklmnopqrstuvwxyz";
        String B = sc.next();

        //2. A旋转，与B比较，相同返回true，都不同返回false
        if (A.length() != B.length()){
            System.out.println("false");
        }else {
            boolean flag = false;
            for (int i = 0; i < A.length(); i++) {
                A = XuanZhuan(A);
                flag = A.equals(B);
                if (flag){
                    break;
                }
            }
            if (flag){
                System.out.println("True");
            }else
                System.out.println("false");
        }
    }

    public static String XuanZhuan(String str){
        StringBuilder sb = new StringBuilder(str);
        char c = str.charAt(0);
        sb.deleteCharAt(0);
        sb.append(c);
        return sb.toString();
    }
}
