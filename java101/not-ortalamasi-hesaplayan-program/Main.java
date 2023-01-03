import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Lessons
        int math, physics, chemistry, turkish, history, music;
        // Take values from user
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen notlarınızı int türünde giriniz!");

        System.out.print("Matematik Notunuz: ");
        math = input.nextInt();
        System.out.print("Fizik Notunuz: ");
        physics = input.nextInt();
        System.out.print("Kimya Notunuz: ");
        chemistry = input.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkish = input.nextInt();
        System.out.print("Tarih Notunuz: ");
        history = input.nextInt();
        System.out.print("Müzik Notunuz: ");
        music = input.nextInt();

        input.close();

        int total = math + physics + chemistry + turkish + history + music;
        double average = total / 6.0;
        System.out.println("Ortalamanız : " + average);
        System.out.println(average > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

    }
}