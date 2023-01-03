package Method;

import java.util.Random;

public class ChouJiang2 {
    public static void main(String[] args) {
        //1.定义奖池
        int[] arr = {2,3,4,5,6,7,8};

        //2.抽奖
        Random rdm = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = rdm.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        //3.开奖
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
