package java102.threadRace;

import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> mainList = new ArrayList<Integer>();
    static ArrayList<Integer> evenList = new ArrayList<Integer>();
    static ArrayList<Integer> oddList = new ArrayList<Integer>();

    public static void main(String[] args) {
        // 1'den 10000'e kadar olan sayıları mainList'e ekle
        for (int i = 1; i <= 10000; i++) {
            mainList.add(i);
        }

        // mainList'i 4 eşit parçaya ayır
        ArrayList<ArrayList<Integer>> subLists = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 4; i++) {
            subLists.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < mainList.size(); i++) {
            subLists.get(i % 4).add(mainList.get(i));
        }

        // 4 Thread oluştur
        for (int i = 0; i < 4; i++) {
            Thread thread = new Thread(new MyThread(subLists.get(i), evenList, oddList));
            thread.start();
        }

        // Çift sayıları yazdır
        System.out.println("Çift sayılar: " + evenList);

        // Tek sayıları yazdır
        System.out.println("Tek sayılar: " + oddList);
    }
}
