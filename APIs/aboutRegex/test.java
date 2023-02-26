package APIs.aboutRegex;

public class test {
    public static void main(String[] args) {
        String qq = "1234567890";

        System.out.println(checkQQ(qq));

    }

    public static boolean checkQQ(String qq){
        if (qq.length() < 6 || qq.length() > 10){
            return false;
        } else if (qq.startsWith("0")) {
            return false;
        }

        for (int i = 0; i < qq.length(); i++) {
            if (qq.charAt(i) < '0' || qq.charAt(i) > '9'){
                return false;
            }
        }

        return true;


    }
}
