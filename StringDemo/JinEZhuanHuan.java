package StringDemo;

import java.util.Scanner;

public class JinEZhuanHuan {
    public static void main(String[] args) {
        //键盘录入金额
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        //定义字符串，接受结果
        String result = "";
        //判断金额是否有效
        if (money >= 0 && money <= 9999999){
            //定义一个字符串，存大写的money
            String moneyCap = "";
            //得到money中的每一个数字
            while (true){
                //从右往左依次获取数字
                int ge = money % 10;
                String capitalNumber = getCapitalNum(ge);
                moneyCap = capitalNumber + moneyCap;
                //左移一位
                money = money / 10;
                //获取完毕，money == 0
                if (money == 0){
                    break;
                }
            }

            //大写数字前补零
            int count = 7 - moneyCap.length();
            for (int i = 0; i < count; i++) {
                moneyCap = "零" + moneyCap;
            }

            //插入单位
            String[] danWei = {"佰","拾","万","仟","佰","拾","元"};
            for (int i = 0; i < moneyCap.length(); i++) {
                result = result + moneyCap.charAt(i) + danWei[i];
            }
        }else{
            System.out.println("输入金额无效。");
        }

        System.out.println(result);
    }

    public static String getCapitalNum(int num){
        String[] nums = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return nums[num];
    }
}
