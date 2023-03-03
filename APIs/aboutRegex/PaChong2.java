package APIs.aboutRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaChong2 {
    public static void main(String[] args) {

        String str = "666";

        //手机号，邮箱，QQ号，身份证号，
        String regexPhone = "1[2-9]\\d{9}";
        String regexMail = "\\w{2,10}@[a-zA-Z1-9](.[a-z]){1,3}";
        String regexQQ = "[1-9]\\d{6,11}";
        String regexID = "[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0\\d|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
        String regex = regexPhone + "|" + regexMail + "|" + regexQQ + "|" + regexID;

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(str);

        while (m.find()){
            String str1 = m.group();
            System.out.println(str1);
        }
    }
}
