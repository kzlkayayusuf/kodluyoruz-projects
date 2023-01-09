package java101.palindromikKelime;

import java.util.Scanner;

public class Main {
    static boolean isPalindrome2(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return str.equals(reverse) ? true : false;
    }

    public static void main(String[] args) {

        boolean isPalindromeWord = true;
        String word = "";
        Scanner input = new Scanner(System.in);

        while (isPalindromeWord) {
            System.out.print("Kelime Giriniz: ");
            word = input.nextLine();
            isPalindromeWord = isPalindrome(word);
            System.out.println(word
                    + (!isPalindromeWord ? " kelimesi palindromik kelime değidir" : " kelimesi palindromik kelimedir"));
        }

        input.close();
        System.out.println("Tekrar bekleriz!");
    }
}
