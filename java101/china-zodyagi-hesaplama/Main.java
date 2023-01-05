import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int birthYear, remainder;
        String chinaHoroscope;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        birthYear = input.nextInt();
        input.close();

        remainder = birthYear % 12;

        if (birthYear < 1923) {
            System.out.println("Geçersiz Doğum Yılı,Lütfen tekrar deneyiniz!");
        } else {
            switch (remainder) {
                case 0:
                    chinaHoroscope = "Maymun";
                    break;
                case 1:
                    chinaHoroscope = "Horoz";
                    break;
                case 2:
                    chinaHoroscope = "Köpek";
                    break;
                case 3:
                    chinaHoroscope = "Domuz";
                    break;
                case 4:
                    chinaHoroscope = "Fare";
                    break;
                case 5:
                    chinaHoroscope = "Öküz";
                    break;
                case 6:
                    chinaHoroscope = "Kaplan";
                    break;
                case 7:
                    chinaHoroscope = "Tavşan";
                    break;
                case 8:
                    chinaHoroscope = "Ejderha";
                    break;
                case 9:
                    chinaHoroscope = "Yılan";
                    break;
                case 10:
                    chinaHoroscope = "At";
                    break;
                case 11:
                    chinaHoroscope = "Koyun";
                    break;

                default:
                    chinaHoroscope = "";
                    break;
            }
            System.out.println("Çin Zodyağı Burcunuz: " + chinaHoroscope);
        }

    }
}
