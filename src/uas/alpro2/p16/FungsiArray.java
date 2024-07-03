package uas.alpro2.p16;

import java.util.Random;

public class FungsiArray {

    public static void main(String[] args) {
        Random random = new Random();
        String[] dosen = {"Herman", "Salsa", "Susi", "Jukir", "Ateng", "Kadung", "Tresno", "Bagja","Mamik", "Euis", "Fadil", "Iman", "Jeysha", "Flinda", "Desi"};
        String[] mahasiswa = {"Angel", "Sisrik", "Sule", "Eman", "Luhir", "Jaja", "Michael", "Sabrina", "Istiqoma", "Yanti", "Bambang", "Dion", "Pardi", "Rahmah", "Putri", "Isabel", "Sabit", "Kuncung", "Yance", "Beckaham" };

        System.out.println("Daftar dosen (acak):");
        
        boolean[] usedIndices = new boolean[dosen.length];
        int count = 0;
        while (count < dosen.length) {
            int randomIndex = random.nextInt(dosen.length);
            if (!usedIndices[randomIndex]) {
                usedIndices[randomIndex] = true;
                System.out.println((count + 1) + "). " + dosen[randomIndex]);
                count++;
            }
        }

        System.out.println("\nDaftar Mahasiswa:");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println((i + 1) + "). " + mahasiswa[i]);
        }

        System.out.println("\nJumlah Mahasiswa = " + mahasiswa.length);
        System.out.println("\nUBH Terakreditasi Baik Sekali");
    }
}
