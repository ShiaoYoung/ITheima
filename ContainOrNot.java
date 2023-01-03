public class ContainOrNot {
    public static void main(String[] args) {
        int[] arr = {6,7,7,8,9,0,1,2,3,34,67,54,35,2};

        boolean x = contain(arr,67);
        System.out.println(x);
    }

    public static boolean contain(int[] arr,int num){
        for (int j : arr) {
            if (j == num) {
                return true;
            }
        }
        return false;
    }
}
