package StringDemo;

import java.util.Random;
import java.util.Scanner;

public class DaLuanStr {
    public static void main(String[] args) {
        //1. 键入一个字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //2. 打乱字符串内容（字符数组）
        char[] chars = str.toCharArray();

        //3. 打乱数组内容
        Random random = new Random();
        for (int i = 0; i < chars.length; i++) {
            int Index = random.nextInt(chars.length);
            char c = chars[i];
            chars[i] = chars[Index];
            chars[Index] = c;
        }

        //4. 字符数组变回字符串
        String result = new String(chars);
        System.out.println(result);

    }
}
