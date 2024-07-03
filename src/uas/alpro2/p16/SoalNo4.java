
class Orang {
    String nama;

    Orang(String nama) {
        this.nama = nama;
    }

    void info() {
        System.out.println("Nama: " + nama);
    }
}

class Dosen extends Orang {
    String matakuliah;

    Dosen(String nama, String matakuliah) {
        super(nama);
        this.matakuliah = matakuliah;
    }

    @Override
    void info() {
        System.out.println("Dosen: " + nama + ", Mengajar: " + matakuliah);
    }
}

class Mahasiswa extends Orang {
    double ipk;

    Mahasiswa(String nama, double ipk) {
        super(nama);
        this.ipk = ipk;
    }

    @Override
    void info() {
        System.out.println("Mahasiswa: " + nama + ", IPK: " + ipk);
    }
}

class ProgramStudi {
    String namaProdi;

    ProgramStudi(String namaProdi) {
        this.namaProdi = namaProdi;
    }

    void info() {
        System.out.println("Program Studi: " + namaProdi);
    }
}

class Fakultas {
    String namaFakultas;

    Fakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
    }

    void info() {
        System.out.println("Fakultas: " + namaFakultas);
    }
}

class IPK {
    String nama;
    double nilaiIpk;

    IPK(String nama, double nilaiIpk) {
        this.nama = nama;
        this.nilaiIpk = nilaiIpk;
    }

    void info() {
        System.out.println("Nama: " + nama + ", IPK: " + nilaiIpk);
    }
}

class Matakuliah {
    String namaMatakuliah;

    Matakuliah(String namaMatakuliah) {
        this.namaMatakuliah = namaMatakuliah;
    }

    void info() {
        System.out.println("Matakuliah: " + namaMatakuliah);
    }
}

public class SoalNo4 {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Salsa", "Algoritma Mesin Gerak");
        Mahasiswa mahasiswa1 = new Mahasiswa("Adam", 3.80);
        ProgramStudi prodi1 = new ProgramStudi("Sistem Informasi");
        Fakultas fakultas1 = new Fakultas("Informatika");
        IPK ipk1 = new IPK("Adam", 3.80);

        Dosen dosen2 = new Dosen("Euis", "Kalkulus III");
        Mahasiswa mahasiswa2 = new Mahasiswa("Jelita", 3.60);
        ProgramStudi prodi2 = new ProgramStudi("Teknik Informatika");
        Fakultas fakultas2 = new Fakultas("Teknik");
        IPK ipk2 = new IPK("Jelita", 3.60);

        Dosen dosen3 = new Dosen("Felinda", "Ekonomi Makro");
        Mahasiswa mahasiswa3 = new Mahasiswa("Aminah", 3.65);
        ProgramStudi prodi3 = new ProgramStudi("Manajemen");
        Fakultas fakultas3 = new Fakultas("Ekonomi");
        IPK ipk3 = new IPK("Aminah", 3.65);

        Matakuliah matakuliah1 = new Matakuliah("Algoritma Mesin Gerak");
        Matakuliah matakuliah2 = new Matakuliah("Kalkulus III");
        Matakuliah matakuliah3 = new Matakuliah("Ekonomi Makro");

        Orang[] orang = {dosen1, mahasiswa1, dosen2, mahasiswa2, dosen3, mahasiswa3};
        ProgramStudi[] prodi = {prodi1, prodi2, prodi3};
        Fakultas[] fakultas = {fakultas1, fakultas2, fakultas3};
        IPK[] ipk = {ipk1, ipk2, ipk3};
        Matakuliah[] matakuliah = {matakuliah1, matakuliah2, matakuliah3};
        
        System.out.println("UBH Perguruan Tinggi Kota Bekasi");

        System.out.println("=== Informasi Dosen dan Mahasiswa ===");
        for (Orang o : orang) {
            o.info();
        }

        System.out.println("\n=== Informasi Program Studi ===");
        for (ProgramStudi ps : prodi) {
            ps.info();
        }

        System.out.println("\n=== Informasi Fakultas ===");
        for (Fakultas f : fakultas) {
            f.info();
        }

        System.out.println("\n=== Informasi IPK ===");
        for (IPK i : ipk) {
            i.info();
        }

        System.out.println("\n=== Informasi Matakuliah ===");
        for (Matakuliah mk : matakuliah) {
            mk.info();
        }
    }
}
