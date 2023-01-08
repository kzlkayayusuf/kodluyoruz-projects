package java101.obs;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average, matAverage, fizikAverage, kimyaAverage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int matNote, int fizikNote, int kimyaNote) {

        if ((matNote >= 0 && matNote <= 100)) {
            this.mat.note = matNote;

        }

        if ((fizikNote >= 0 && fizikNote <= 100)) {
            this.fizik.note = fizikNote;

        }

        if ((kimyaNote >= 0 && kimyaNote <= 100)) {
            this.kimya.note = kimyaNote;

        }

    }

    public void addBulkVerbalGrade(int matVerbalNot, int fizikVerbalNot, int kimyaVerbalNote) {
        if ((matVerbalNot >= 0 && matVerbalNot <= 100)) {
            this.mat.verbalGrade = matVerbalNot;
        }
        if ((fizikVerbalNot >= 0 && fizikVerbalNot <= 100)) {
            this.fizik.verbalGrade = fizikVerbalNot;
        }
        if ((kimyaVerbalNote >= 0 && kimyaVerbalNote <= 100)) {
            this.kimya.verbalGrade = kimyaVerbalNote;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.fizikAverage = (this.fizik.note * 0.8) + (this.fizik.verbalGrade * 0.2);
        this.kimyaAverage = (this.kimya.note * 0.8) + (this.kimya.verbalGrade * 0.2);
        this.matAverage = (this.mat.note * 0.8) + (this.mat.verbalGrade * 0.2);
        this.average = (this.matAverage + this.fizikAverage + this.kimyaAverage) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Ortalaması : " + this.matAverage);
        System.out.println("Fizik Ortalaması : " + this.fizikAverage);
        System.out.println("Kimya Ortalaması : " + this.kimyaAverage);
    }

}
