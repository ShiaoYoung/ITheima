package StringDemo;

import java.util.Scanner;

public class GetLastWordsNum {

    //计算一句话中最后一个单词的字母个数
    public static void main(String[] args) {
        //1. 给一个字符串，有多个单词
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //2. 倒着遍历，计数
        int count = 0;
        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) == ' '){
                break;
            }else {
                count++;
            }
        }
        System.out.println(count);
    }
}
