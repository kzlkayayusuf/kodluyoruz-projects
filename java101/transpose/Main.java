package java101.transpose;

import java.util.Scanner;

public class Main {
    static int[][] receivingMatris() {

        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz: ");
        int n = input.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        int k = input.nextInt();

        int matris[][] = new int[n][k];
        System.out.println(matris.length + " satırlı ve "
                + matris[0].length + " sütunlu" + " bir matrisin elemanlarını giriniz: ");
        for (int row = 0; row < matris.length; row++) {
            for (int column = 0; column < matris[row].length; column++) {
                matris[row][column] = input.nextInt();
            }
        }

        input.close();

        return matris;

    }

    static void printMatris(int[][] matris) {
        for (int i[] : matris) {
            for (int j : i) {
                System.out.print(j + "   ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int[][] matris) {
        int tronsposeMatris[][] = new int[matris[0].length][matris.length];
        for (int row = 0; row < matris.length; row++) {
            for (int column = 0; column < matris[row].length; column++) {
                tronsposeMatris[column][row] = matris[row][column];
            }
        }
        return tronsposeMatris;
    }

    public static void main(String[] args) {

        int[][] matris = receivingMatris();
        System.out.println("Matris : ");
        printMatris(matris);

        matris = transpose(matris);
        System.out.println("Transpoze : ");
        printMatris(matris);
    }
}
