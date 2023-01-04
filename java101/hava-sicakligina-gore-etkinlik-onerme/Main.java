import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String state;
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz: ");
        heat = input.nextInt();
        input.close();

        if (heat < 5) {
            state = "Kayak";
        } else if (heat >= 5 && heat < 15) {
            state = "Sinema";
        } else if (heat >= 15 && heat < 25) {
            state = "Piknik";
        } else {
            state = "Yüzme";
        }

        switch (state) {
            case "Kayak":
                System.out.println("Kayak yapabilirsiniz.");
                break;
            case "Sinema":
                System.out.println("Sinemaya gidebilirsiniz.");
                break;
            case "Piknik":
                System.out.println("Pikniğe gidebilirsiniz.");
                break;
            case "Yüzme":
                System.out.println("Yüzmeye gidebilirsiniz.");
                break;

            default:
                System.out.println("Kodlama yapabilirsin!");
                break;
        }
    }
}
