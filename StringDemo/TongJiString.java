package StringDemo;

import java.util.Scanner;

public class TongJiString {
    public static void main(String[] args) {
        //键入一个字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //统计键入字符串的大写字母、小写字母、数字的个数
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z'){
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }
        System.out.println("" + smallCount + " " + bigCount + " " + numberCount);
    }
}
