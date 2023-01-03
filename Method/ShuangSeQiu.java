package Method;

import java.util.Random;
import java.util.Scanner;

public class ShuangSeQiu {
    public static void main(String[] args) {
        System.out.println("==============================");
        //1. 生成中奖号码
        int[] SysNums = creatNumber();

        //查看中奖号码
        /*for (int i = 0; i < SysNums.length; i++) {
            System.out.print(SysNums[i] + " ");
        }
        System.out.println();
        System.out.println("==============================");*/

        //2. 用户输入号码
        int[] UserNums = UserInput();
        
        //3. 判断是否中奖
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < UserNums.length-1; i++) {
            int temp = UserNums[i];
            for (int i1 = 0; i1 < SysNums.length; i1++) {
                if (temp == SysNums[i1]){
                    redCount++;
                    break;
                }
            }
        }
        if (UserNums[UserNums.length - 1] == SysNums[SysNums.length -1]){
            blueCount++;
        }

        if (redCount == 6 && blueCount == 1){
            System.out.println("恭喜你，中了1000万元");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你，中了500万元");
        }else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，中了3000元");
        }else if (redCount == 5 && blueCount == 0 ||
                  redCount == 4 && blueCount == 1) {
            System.out.println("恭喜你，中了200元");
        }else if (redCount == 4 && blueCount == 0 ||
                  redCount == 3 && blueCount == 1 ||
                  redCount == 2 && blueCount == 1) {
            System.out.println("恭喜你，中了10元");
        }else if (redCount == 1 && blueCount == 1 ||
                  redCount == 0 && blueCount == 1) {
            System.out.println("恭喜你，中了5元");
        }else {
            System.out.println("谢谢参与！");
        }



    }

    public static int[] UserInput(){
        //定义7个球的容器
        int[] nums = new int[7];

        //用户输入

        //红球
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i+1) + "个红球");
            int num = sc.nextInt();
            if (num >= 1 && num <= 33){
                boolean flag = contains(num,nums);
                if (!flag){
                    nums[i] = num;
                    i++;
                }else {
                    System.out.println("数字重复，请重新输入。");
                }
            }else {
                System.out.println("输入范围错误，请重新输入。");
            }
        }

        //蓝球
        while (true){
            System.out.println("请输入蓝球：");
            int blueNum = sc.nextInt();
            if (blueNum >= 1 && blueNum <= 16){
                nums[6] = blueNum;
                break;
            }
            System.out.println("输入范围错误，请重新输入。");
        }

        return nums;

    }

    public static int[] creatNumber(){
        //定义7个球的容器
        int[] nums = new int[7];

        Random rdm = new Random();
        //随机出红球
        for (int i = 0; i < nums.length - 1; ) {
            int temp = rdm.nextInt(33) + 1;
            boolean flag = contains(temp,nums);
            if (!flag){
                nums[i] = temp;
                i++;
            }
        }
        //随机出蓝球
        nums[6] = rdm.nextInt(16) + 1;

        return nums;
    }

    public static boolean contains(int obj,int[] objs){
        for (int i = 0; i < objs.length; i++) {
            if (objs[i] == obj){
                return true;
            }
        }

        return false;
    }
}
