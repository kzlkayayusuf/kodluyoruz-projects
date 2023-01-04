import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mounth, day;
        String horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ay :");
        mounth = input.nextInt();

        System.out.print("Doğduğunuz Gun :");
        day = input.nextInt();

        input.close();

        if ((mounth >= 1 && mounth <= 12) && (day >= 1 && day <= 31)) {
            if ((mounth == 12) && (day >= 22) || ((mounth == 1) && (day <= 21))) {
                horoscope = "Oğlak Burcu";
            } else if ((mounth == 1) && (day >= 22) || ((mounth == 2) && (day <= 19))) {
                horoscope = "Kova Burcu";
            } else if ((mounth == 2) && (day >= 20) || ((mounth == 3) && (day <= 20))) {
                if (day > 28)
                    isError = true;
                horoscope = "Balık Burcu";
            } else if ((mounth == 3) && (day >= 21) || ((mounth == 4) && (day <= 20))) {
                horoscope = "Koç Burcu";
            } else if ((mounth == 4) && (day >= 21) || ((mounth == 5) && (day <= 21))) {
                if (day > 30)
                    isError = true;
                horoscope = "Boğa Burcu";
            } else if ((mounth == 5) && (day >= 22) || ((mounth == 6) && (day <= 22))) {
                horoscope = "İkizler Burcu";
            } else if ((mounth == 6) && (day >= 23) || ((mounth == 7) && (day <= 22))) {
                if (day > 30)
                    isError = true;
                horoscope = "Yengeç Burcu";
            } else if ((mounth == 7) && (day >= 23) || ((mounth == 8) && (day <= 22))) {
                horoscope = "Aslan Burcu";
            } else if ((mounth == 8) && (day >= 23) || ((mounth == 9) && (day <= 22))) {
                horoscope = "Başak Burcu";
            } else if ((mounth == 9) && (day >= 23) || ((mounth == 10) && (day <= 22))) {
                if (day > 30)
                    isError = true;
                horoscope = "Terazi Burcu";
            } else if ((mounth == 10) && (day >= 23) || ((mounth == 11) && (day <= 21))) {
                horoscope = "Akrep Burcu";
            } else if ((mounth == 11) && (day >= 22) || ((mounth == 12) && (day <= 21))) {
                if (day > 30)
                    isError = true;
                horoscope = "Yay Burcu";
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        System.out.println(isError ? "Hatalı giriş yaptınız, tekrar deneyiniz!" : "Burcunuz: " + horoscope);
    }
}