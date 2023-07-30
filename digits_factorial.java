public class digits_factorial {
    public static void main(String[] args) {
        int n = digitsInFactorial(10);
        System.out.println(n);
    }

    static int digitsInFactorial(int N) {
        double fact = 1;
        int digits = 0;
        while (N > 0) {
            fact = fact * N;
            N = N - 1;
        }
        while (fact > 0) {
            fact = fact / 10;
            digits = digits + 1;
        }
        return digits;
    }

}