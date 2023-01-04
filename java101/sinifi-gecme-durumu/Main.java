import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Lessons
        int math, physics, chemistry, turkish, music;
        // Take values from user
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen notlarınızı giriniz!");

        System.out.print("Matematik Notunuz: ");
        math = input.nextInt();
        System.out.print("Fizik Notunuz: ");
        physics = input.nextInt();
        System.out.print("Kimya Notunuz: ");
        chemistry = input.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkish = input.nextInt();
        System.out.print("Müzik Notunuz: ");
        music = input.nextInt();

        input.close();

        math = (math >= 0 && math <= 100) ? math : 0;
        physics = (physics >= 0 && physics <= 100) ? physics : 0;
        chemistry = (chemistry >= 0 && chemistry <= 100) ? chemistry : 0;
        turkish = (turkish >= 0 && turkish <= 100) ? turkish : 0;
        music = (music >= 0 && music <= 100) ? music : 0;

        int total = math + physics + chemistry + turkish + music;
        double average = total / 5.0;
        System.out.println("Ortalamanız : " + average);
        System.out.println(
                (average <= 55) ? "Sınıfta kaldınız, seneye tekrar görüşmek üzere!" : "Tebrikler sınıfı geçtiniz!");

    }
}