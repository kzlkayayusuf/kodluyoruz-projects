package java101.minesweeperGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isPlaying = true;
        int row = -1, column = -1;

        Scanner input = new Scanner(System.in);

        while (row < 0 || column < 0) {
            System.out.print("Satır sayısını giriniz: ");
            row = input.nextInt();
            System.out.print("Sütun sayısını giriniz: ");
            column = input.nextInt();
            if (row < 0 || column < 0)
                System.out.println("Matris boyutu negatif olamaz , Lütfen tekrar deneyiniz!");
        }

        MineSweeper game = new MineSweeper(new char[row][column], new char[row][column]);

        while (isPlaying) {
            System.out.print("Satır Giriniz: ");
            row = input.nextInt();
            System.out.print("Sütun Giriniz: ");
            column = input.nextInt();

            if (row < 0 || column < 0) {
                System.out.println("Matris indisi negatif olamaz, Lütfen tekrar deneyiniz!");
                System.out.println("===========================");
                continue;
            }

            isPlaying = game.isPlaying(row, column);
        }

        input.close();
    }
}
