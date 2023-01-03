package Method;

import java.util.Random;

public class ChouJiang1 {
    public static void main(String[] args) {
        //1.定义奖池
        int[] arr = {2,3,4,5,6,7,8};

        //2.存抽奖结果
        int[] newArr = new int[arr.length];

        //3.抽奖
        Random rdm = new Random();
        for (int i = 0; i < arr.length; ) {
            int ransomIndex = rdm.nextInt(0, arr.length);
            boolean flag = contain(newArr,arr[ransomIndex]);
            if (!flag){
                newArr[i] = arr[ransomIndex];
                i++;
            }

        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    public static boolean contain(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                return true;
            }
        }
        return false;
    }
}
