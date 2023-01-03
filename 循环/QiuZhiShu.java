package 循环;

import java.util.Random;
import java.util.Scanner;

public class QiuZhiShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        boolean flag = true;

        //从2到num，遍历比较
        /*for (int i = 2; i < num; i++){
            if (num % i == 0){
                flag = false;
                break;
            }
        }

         */

        //从2到num的平方根，不用遍历全部
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(num + "是一个质数。");
        }else
            System.out.println(num + "不是一个质数。");
    }
}