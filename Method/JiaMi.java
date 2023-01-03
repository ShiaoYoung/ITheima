package Method;

public class JiaMi {
    public static void main(String[] args) {
        int pwd = 1983;
        int temp = pwd;

        int count = 0;
        while (pwd != 0){
            pwd  = pwd / 10;
            count++;
        }

        int[] pwdList = new int[count];

        int index = pwdList.length - 1;
        while (temp != 0){
            int ge = temp % 10;
            temp = temp / 10;
            pwdList[index] = ge;
            index--;
        }

        for (int i = 0; i < pwdList.length; i++) {
            pwdList[i] = pwdList[i] +5;
        }

        for (int i = 0; i < pwdList.length; i++) {
            pwdList[i] = pwdList[i] % 10;
        }

        for (int i = 0,j = pwdList.length - 1; i < j; i++,j--) {
            int temp1 =  pwdList[i];
            pwdList[i] = pwdList[j];
            pwdList[j] = temp1;
        }

        int num = 0;
        for (int i = 0; i < pwdList.length; i++) {
            num = num * 10 + pwdList[i];
        }

        System.out.println(num);
    }
}
