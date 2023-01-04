import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.println("Giriş başarılı");
        } else {
            System.out.println("Hatalı kullanıcı adı veya şifre.");
            System.out.print("Şifrenizi sıfırlamak ister misiniz ? (evet veya hayır):");

            String answer = input.nextLine();

            if (answer.equals("evet")) {
                System.out.print("Yeni şifreyi giriniz: ");
                password = input.nextLine();
                input.close();

                if (password.equals("java101")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                    System.out.print("Yeni şifreniz:" + password);
                }
            } else {
                System.out.println("Tekrar giriş yapmayı denemelisiniz!");
            }
        }
    }
}
