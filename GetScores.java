import java.util.Scanner;

public class GetScores {
    public static void main(String[] args) {

        int[] scores = getScores();

        int max = getMax(scores);
        int min = getMin(scores);
        int sum = getSum(scores);
        int avg = (sum - min - max ) / (scores.length - 2);
        System.out.print(avg);
    }

    public static int[] getScores(){
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[6];
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入打分：");
            int score = sc.nextInt();
            if (score >=0 && score <= 100){
                scores[i] = score;
                i++;
            }else System.out.print("输入格式错误，请重新输入。");
        }
        return scores;
    }

    public static int getMax(int[] scoreArr){
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] > max){
                max = scoreArr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scoreArr){
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] < min){
                min = scoreArr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
        }
        return sum;
    }

}
