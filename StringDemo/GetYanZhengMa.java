package StringDemo;

import java.util.Random;

public class GetYanZhengMa {
    public static void main(String[] args) {
        //1. 数字放在一个数组中，大小写字母放到一个数组中
        char[] nums = {'0','1','2','3','4','5','6','7','8','9'};
        char[] chars = new char[52];
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            chars[i] = c;
        }
        for (int i = 26; i < chars.length; i++){
            char c = (char) ('A' + (i - 26));
            chars[i] = c;
        }

        //2. 循环5次，生成验证码，只有一个数字
        char[] result = new char[5];
        Random random = new Random();
        for (int i = 0; i < result.length - 1; i++) {
            int rdmCharIndex = random.nextInt(chars.length);
            result[i] = chars[rdmCharIndex];
        }
        int rdmNumIndex = random.nextInt(10);
        result[4] = nums[rdmNumIndex];

        //3. 打乱result数组
        for (int i = 0; i < result.length; i++) {
            int Index = random.nextInt(result.length);
            char temp = result[i];
            result[i] = result[Index];
            result[Index] = temp;
        }

        //4. 生成String
        String resultStr = new String(result);
        System.out.println(resultStr);
    }
}
