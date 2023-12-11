import java.util.Scanner;

class SimulasiPassingGradeSiswa {
    public static void main (String[] args) {
        double avgUjian, avgBahasa;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian matematika: ");
        int nilai_mtk = input.nextInt();

        System.out.print("Masukkan nilai ujian B.Indonesia: ");
        int nilai_indo = input.nextInt();

        System.out.print("Masukkan nilai ujian B.Inggris: ");
        int nilai_ingg = input.nextInt();

        System.out.print("Masukkan nilai ujian IPA: ");
        int nilai_ipa = input.nextInt();

        // rata rata nilai ujian
        avgUjian = (nilai_mtk + nilai_indo + nilai_ingg + nilai_ipa) / 4;

        // rata rata nilai bahasa
        avgBahasa = (nilai_indo + nilai_ingg)/2;

        System.out.println("==============================================");
        System.out.println("Memenuhi syarat masuk SMK Padepokan 79: "+ (avgUjian >= 73));
        System.out.println("Memenuhi syarat masuk jurusan sastra: "+ (avgBahasa >= 75));
        System.out.println("Memenuhi syarat masuk Teknik komputer jaringan: "+ (nilai_mtk > 80));
    }
}