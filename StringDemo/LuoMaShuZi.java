package StringDemo;

import java.util.Scanner;

public class LuoMaShuZi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        StringBuilder result = new StringBuilder();
        while (true){
            //1.键入字符串
            System.out.println("请输入一个字符串：");
            input = sc.next();
            //2.长度小于等于9，只能是数字
            boolean flag = checkStr(input);
            //3.转换成罗马数字
            if (flag){
                break;
            }else {
                System.out.println("输入的字符串不合法。");
                continue;
            }
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int num = c - 48;
            String s = numToLuoMa(num);
            result.append(s);
        }
        System.out.println(result);
    }

    public static String numToLuoMa(int num){
        //罗马数字
        String[] nums = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return nums[num];
    }


    public static boolean checkStr(String str){
        if (str.length() >9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
}
