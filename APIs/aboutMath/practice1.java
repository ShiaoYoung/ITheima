package APIs.aboutMath;

public class practice1 {
    public static void main(String[] args) {
        System.out.println(isPrime(27));
        System.out.println(isPrime(7));
    }

    public static boolean isPrime(int number){
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            if (number % i == 0){
                return true;
            }
        }
        System.out.println(count);
        return false;
    }

}
