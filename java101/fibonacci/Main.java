package java101.fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fibonacci, firstNumber = 0, secondNumber = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        fibonacci = input.nextInt();
        input.close();

        System.out.println(fibonacci < 0
                ? "Kural Hatası Oluştu. Fibanocci serisi pozitif tam sayılardan oluşur.\nLütfen girdiğiniz değeri kontrol ediniz."
                : fibonacci + " Elemanlı Fibonacci Serisi: ");

        for (int i = 0; i <= fibonacci; i++) {
            System.out.print(firstNumber + " ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

    }
}
