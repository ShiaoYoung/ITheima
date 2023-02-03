package APIs.aboutMath;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        //自幂数

        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (isZiMi(i)){
                count++;
            }
        }
        System.out.println(count);

    }

    public static boolean isZiMi(int number){
        //统计位数
        int count1 = 0;
        int temp1 = number;
        int temp2 = number;
        while (temp1 != 0){
            count1++;
            temp1 = temp1 / 10;
        }

        //计算结果
        int result = 0;
        for (int i = 1; i <= count1; i++) {
            result += Math.pow(number % 10, count1);
            number /= 10;
        }

        if (result == temp2){
            return true;
        }

        return false;
    }
}