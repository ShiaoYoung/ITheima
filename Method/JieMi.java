package Method;

public class JieMi {
    public static void main(String[] args) {
        int pwd = 8346;
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

        for (int i = 0,j = pwdList.length - 1; i < j; i++,j--) {
            int temp1 = pwdList[i];
            pwdList[i] = pwdList[j];
            pwdList[j] = temp1;
        }

        for (int i = 0; i < pwdList.length; i++) {
            if (pwdList[i] >= 0 && pwdList[i] <= 4){
                pwdList[i] = pwdList[i] + 10;
            }
        }

        for (int i = 0; i < pwdList.length; i++) {
            pwdList[i] = pwdList[i] - 5;
        }

        int num = 0;
        for (int i = 0; i < pwdList.length; i++) {
            num = num * 10 + pwdList[i];
        }

        System.out.println(num);
    }
}
