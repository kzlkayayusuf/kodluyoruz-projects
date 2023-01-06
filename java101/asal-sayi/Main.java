public class Main {
    public static void main(String[] args) {
        int divisorsNumber = 0;

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorsNumber++;
                }
            }
            if (divisorsNumber == 2) {
                System.out.print(i + " ");
            }
            divisorsNumber = 0;
        }
    }
}
