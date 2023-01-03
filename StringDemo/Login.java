package StringDemo;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //已知正确的用户名和密码
        String rightUsername = "SanJin";
        String rightPassword = "666666";

        //三次登陆机会，登陆成功给出提示
        for (int count = 1; count < 4; count++) {
            System.out.println("请输入用户名：");
            String inputUsername = sc.next();
            System.out.println("请输入密码：");
            String inputPassword = sc.next();
            if (inputUsername.equals(rightUsername) && inputPassword.equals(rightPassword)){
                System.out.println("登陆成功！");
                break;
            }else{
                if (count == 3){
                    System.out.println("账号被锁定，请联系管理员。");
                    break;
                }
                System.out.println("密码错误，您还剩下" + (3 - count) + "次机会。");
            }
        }
    }
}
