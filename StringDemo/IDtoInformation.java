package StringDemo;

public class IDtoInformation {
    public static void main(String[] args) {
        String id = "371223202301010093";

        //出生年月日
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);

        //性别
        String gender = "";
        char c = id.charAt(16);
        int num = c - 48;
        if (num % 2 == 0){
            gender = "女";
        }else {
            gender = "男";
        }

        //打印信息
        System.out.println("个人信息为：");
        System.out.println("出生日期：\n" + year + "年" + month + "月" + day + "日");
        System.out.println("性别为：" + gender);
    }
}
