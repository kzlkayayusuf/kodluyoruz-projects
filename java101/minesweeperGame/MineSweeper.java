package java101.minesweeperGame;

import java.util.Random;

public class MineSweeper {

    char[][] matris;
    char[][] minesMatris;

    MineSweeper(char[][] matris, char[][] minesMatris) {
        this.matris = receivingMatris(matris);
        this.minesMatris = minesMatris(minesMatris);
        System.out.println("Mayınların Konumu");
        printMatris(this.minesMatris);
        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        printMatris(this.matris);
    }

    char[][] receivingMatris(char[][] matris) {

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = '-';
            }
        }
        return matris;
    }

    void printMatris(char[][] matris) {
        for (char[] i : matris) {
            for (char j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    char[][] minesMatris(char[][] matris) {
        int mines = (matris.length * matris[0].length) / 4;
        Random random = new Random();
        // System.out.println("Mines: " + mines);
        while (mines > 0) {
            for (int i = 0; i < matris.length; i++) {
                for (int j = 0; j < matris[i].length; j++) {
                    matris[i][j] = '-';
                    int randomN = random.nextInt(mines + i) + (mines - j);
                    // System.out.println(randomN);
                    if (mines > 0 && randomN < mines) {
                        matris[i][j] = '*';
                        mines--;
                    }
                }
            }
        }
        return matris;
    }

    boolean isPlaying(int row, int column) {

        char[][] matris = this.matris;
        char[][] minesMatris = this.minesMatris;

        System.out.println("===========================");

        if (row < matris.length && column < matris[0].length) {
            if (matris[row][column] != '-') {
                System.out.println("Bu noktayı zaten seçtiniz. Lütfen başka bir yer seçin!");
                return true;
            } else {
                if (minesMatris[row][column] != '*') {
                    char a = check(row, column);
                    matris[row][column] = a;
                    printMatris(matris);
                    if (isFinish()) {
                        System.out.println("Tebrikler, Oyunu Kazandınız!");
                        System.out.println("Mayın Tarlası: ");
                        printMatris(minesMatris);
                        return false;
                    }
                    return true;
                } else {
                    System.out.println("Game Over!!");
                    return false;
                }
            }

        } else {
            System.out.println("Matrisin boyutunu geçmeyin!");
            return true;
        }

    }

    char check(int row, int column) {
        int count = 0;
        char[][] minesMatris = this.minesMatris;
        int mineRow = minesMatris.length;
        int mineColumn = minesMatris[0].length;

        if ((row - 1) >= 0 && (column - 1) >= 0 && minesMatris[row - 1][column - 1] == '*') {
            count++;
        }
        if ((row - 1) >= 0 && minesMatris[row - 1][column] == '*') {
            count++;
        }
        if ((row - 1) >= 0 && (column + 1) < mineColumn && minesMatris[row - 1][column
                + 1] == '*') {
            count++;
        }
        if ((column - 1) >= 0 && minesMatris[row][column - 1] == '*') {
            count++;
        }
        if ((column + 1) < mineColumn && minesMatris[row][column + 1] == '*') {
            count++;
        }
        if ((column - 1) >= 0 && (row + 1) < mineRow && minesMatris[row + 1][column -
                1] == '*') {
            count++;
        }
        if ((row + 1) < mineRow && minesMatris[row + 1][column] == '*') {
            count++;
        }
        if ((row + 1) < mineRow && (column + 1) < mineColumn && minesMatris[row +
                1][column + 1] == '*') {
            count++;
        }

        return Integer.toString(count).charAt(0);
    }

    boolean isFinish() {
        char[][] matris = this.matris;

        int mines = (matris.length * matris[0].length) / 4;
        int count = 0;

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                count += (matris[i][j] == '-') ? 1 : 0;
            }
        }

        return count == mines ? true : false;
    }
}
