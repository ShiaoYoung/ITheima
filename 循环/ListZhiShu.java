package 循环;

import java.util.Scanner;

public class ListZhiShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 2; i <= input; i++){
            boolean flag = false;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.print(i + " ");
            }
        }
    }
}
