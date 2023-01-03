package StringDemo;

public class PingBiPhoneNum {
    public static void main(String[] args) {
        //13112345678-->131****5678
        String phoneNum = "13112345678";

        //截前三位
        String start = phoneNum.substring(0,3);
        //截后四位
        String end = phoneNum.substring(7);
        //拼接
        String result = start + "****" + end;

        System.out.println(result);
    }
}
