package java102.genericsList;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> liste = new MyList<>();
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(20);
        liste.add(50);
        liste.add(60);
        liste.add(70);

        liste.printArray();

        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + liste.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + liste.indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + liste.lastIndexOf(20));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = liste.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        // Liste veri türünde alt bir liste oluşturdu
        MyList<Integer> altListem = liste.subList(0, 3);
        System.out.println(altListem.toString());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + liste.contains(20));
        System.out.println("Listemde 120 değeri : " + liste.contains(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste.clear();
        System.out.println(liste.toString());
        liste.printArray();

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        MyList<String> stringList = new MyList<>();
        System.out.println("Liste Durumu : " + (stringList.isEmpty() ? "Boş" : "Dolu"));
        stringList.add("erzurum");
        stringList.add("istanbul");
        stringList.add("ankara");
        stringList.add("bursa");
        stringList.add("izmir");
        stringList.add("erzincan");
        stringList.add("van");
        stringList.add("kars");
        stringList.add("erzurum");

        stringList.printArray();

        System.out.println("Liste Durumu : " + (stringList.isEmpty() ? "Boş" : "Dolu"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + stringList.indexOf("van"));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + stringList.indexOf("kayseri"));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + stringList.lastIndexOf("erzurum"));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] stringDizi = stringList.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + stringDizi[0]);

        // Liste veri türünde alt bir liste oluşturdu
        MyList<String> altStringListem = stringList.subList(0, 3);
        System.out.println(altStringListem.toString());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde Kars değeri : " + stringList.contains("kars"));
        System.out.println("Listemde Elazığ değeri : " + stringList.contains("elazığ"));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        stringList.clear();
        System.out.println(stringList.toString());

        System.out.println("Dizideki Eleman Sayısı : " + stringList.size());
        System.out.println("Dizinin Kapasitesi : " + stringList.getCapacity());
        stringList.add("malatya");
        stringList.add("çanakkale");
        stringList.add("muğla");
        stringList.add("aydın");
        System.out.println("Dizideki Eleman Sayısı : " + stringList.size());
        System.out.println("Dizinin Kapasitesi : " + stringList.getCapacity());
        stringList.add("denizli");
        stringList.add("afyon");
        stringList.add("şırnak");
        stringList.add("hakkari");
        stringList.add("gaziantep");
        stringList.add("urfa");
        stringList.add("diyarbakır");
        System.out.println("Dizideki Eleman Sayısı : " + stringList.size());
        System.out.println("Dizinin Kapasitesi : " + stringList.getCapacity());
        System.out.println(stringList.toString());
        stringList.remove(5);
        stringList.remove(7);
        stringList.printArray();
        System.out.println(stringList.toString());
        System.out.println("Dizideki Eleman Sayısı : " + stringList.size());
        System.out.println("Dizinin Kapasitesi : " + stringList.getCapacity());

    }
}
