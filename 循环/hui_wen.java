package 循环;

import java.util.Scanner;

public class hui_wen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个不小于两位的整数：");

        int x = sc.nextInt();
        int temp = x;
        int result = 0;

        while (x != 0){
            int i = x % 10;
            x /= 10;
            result = result * 10 + i;
        }
        System.out.println(result);
        System.out.println(result == temp);
    }
}
