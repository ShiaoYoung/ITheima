package StringDemo;

import java.util.Scanner;

public class GetStrsMutiple {
    public static void main(String[] args) {
        //1. 输入两个字符串
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        //2. 字符串转int
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);

        //3. 获得乘积
        int result = number1 * number2;

        //4， 转成字符串
        String resultStr = "" + result;

        System.out.println(resultStr);
    }
}
