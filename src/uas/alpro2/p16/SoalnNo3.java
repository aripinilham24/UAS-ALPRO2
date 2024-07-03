package uas.alpro2.p16;

class Sekolah {
    String akreditasi;

    Sekolah(String akreditasi) {
        this.akreditasi = akreditasi;
    }

    void info() {
        System.out.println("Sekolah Terakreditasi " + akreditasi);
    }

    void info(String keterangan) {
        System.out.println("Sekolah Terakreditasi " + akreditasi + " dengan keterangan: " + keterangan);
    }
}

class SubclassTerbaik extends Sekolah {
    SubclassTerbaik() {
        super("Sangat Baik");
    }

    @Override
    void info() {
        System.out.println("Sekolah Terakreditasi " + akreditasi + " (Subclass Terbaik)");
    }
}

class SubclassNilai extends Sekolah {
    double nilai;

    SubclassNilai(double nilai) {
        super("Baik");
        this.nilai = nilai;
    }

    @Override
    void info() {
        System.out.println("Sekolah Terakreditasi " + akreditasi + " dengan nilai " + nilai);
    }
}

public class SoalnNo3 {
    public static void main(String[] args) {
        Sekolah sekolah = new Sekolah("Baik Sekali");
        SubclassTerbaik terbaik = new SubclassTerbaik();
        SubclassNilai nilai = new SubclassNilai(95.5);

        sekolah.info();
        terbaik.info();
        nilai.info();
        sekolah.info("Sebagai Sekolah Terakreditasi Sangat Baik");
    }
}
