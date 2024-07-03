package uas.alpro2.p16;

class Orang {
    String nama;

    Orang(String nama) {
        this.nama = nama;
    }

    void prestasi() {
        System.out.println(nama + " berprestasi.");
    }
}

class Dosen extends Orang {
    Dosen(String nama) {
        super(nama);
    }

    @Override
    void prestasi() {
        System.out.println("Dosen " + nama + " berprestasi.");
    }
}

class Mahasiswa extends Orang {
    double ipk;

    Mahasiswa(String nama, double ipk) {
        super(nama);
        this.ipk = ipk;
    }

    @Override
    void prestasi() {
        System.out.println("Mahasiswa " + nama + " berprestasi dengan IPK " + ipk + ".");
    }
}

public class SoalNo2 {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Bagja");
        Mahasiswa mahasiswa = new Mahasiswa("Adam", 3.8);

        dosen.prestasi();
        mahasiswa.prestasi();
    }
}
