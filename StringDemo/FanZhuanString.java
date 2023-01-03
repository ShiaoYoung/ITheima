package StringDemo;

public class FanZhuanString {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(reverse(s));
    }

    public static String reverse(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--){
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}
