package APIs.aboutRegex;

public class practice2 {
    public static void main(String[] args) {
        System.out.println(checkID("371212200401010079"));
        System.out.println(checkName("6666"));
    }

    public static boolean checkName(String name){
        String regex = "\\w{4,16}";
        if (name.matches(regex)){
            return true;
        }
        return false;
    }

    public static boolean checkID(String ID){
        String regex = "[1-9]\\d{5}(18|19|20)\\d\\d(0[1-9]|1[012])([012][1-9]|3[01])\\d{3}[\\dxX]";
        if (ID.matches(regex)){
            return true;
        }
        return false;
    }
}
