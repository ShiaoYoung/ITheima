package APIs.aboutRegex;

public class practice1 {
    public static void main(String[] args) {
        //验证正确的手机号
        System.out.println(checkPhoneNum("16666666666"));

        System.out.println("------------------------------------");

        //验证正确的邮箱
        System.out.println(checkMailNum("212345678900@mail.sdu.edu.cn"));

        System.out.println("------------------------------------");

        //验证正确的座机号码
        System.out.println(checkFixedPhoneNum("0531-66666666"));
        System.out.println(checkFixedPhoneNum("053166666666"));


    }

    public static boolean checkPhoneNum(String phone){
        String regex = "1[3-9]\\d{9}";
        if (phone.matches(regex)){
            return true;
        }
        return false;
    }

    public static boolean checkMailNum(String mail){
        String regex = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,3}";
        if (mail.matches(regex)){
            return true;
        }
        return false;
    }

    public static boolean checkFixedPhoneNum(String phone){
        String regex = "0\\d{2,3}-?[1-9]\\d{4,9}";
        if (phone.matches(regex)){
            return true;
        }
        return false;
    }
}
