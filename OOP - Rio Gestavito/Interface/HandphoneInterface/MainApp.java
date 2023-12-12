import java.util.Scanner;

import interfaces.Phone;

public class MainApp {
    public static void main(String[] args) {
        // membuat object phone
        Phone pocoM3 = new Xiaomi();

        PhoneUser rio = new PhoneUser(pocoM3);

        rio.turnOnThePhone();

        Scanner input = new Scanner(System.in);
        int aksi;
        boolean isLooping = true;

        do {
            System.out.println("====Aplikasi interface====");
            System.out.println("[1] nyalakan hp");
            System.out.println("[2] matikan hp");
            System.out.println("[3] perbesar volume");
            System.out.println("[4] perkecil volume");
            System.out.println("[0] keluar ");
            System.out.println("==========================");
            System.out.print("pilih aksi: ");
            aksi = input.nextInt();

            if (aksi == 1) {
                rio.turnOnThePhone();
            } else if (aksi == 2) {
                rio.turnOffThePhone();
            } else if (aksi == 3) {
                rio.makePhoneLouder();
            } else if (aksi == 4) {
                rio.makePhoneSilent();
            } else if (aksi == 0) {
                isLooping = false;
            } else {
                System.out.println("aksi yang dipilih tidak tersedia");
                System.out.println("silahkan pilih aksi kembali!");
            }
        } while(isLooping);

    }   
}
