package Tool_class.Tool_ArrayUtil;

public class ArrayUtil {

    private ArrayUtil(){

    }
    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1){
                sb.append(", ");
            } else if (i == arr.length - 1) {
                sb.append("]");
            }
        }
        return sb.toString();
    }

    public static double getAverage(double[] arr){
        double sum = 0;
        for (double d : arr) {
            sum += d;
        }
        return (sum / arr.length);
    }
}