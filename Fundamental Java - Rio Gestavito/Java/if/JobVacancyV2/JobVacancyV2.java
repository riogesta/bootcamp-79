import java.util.Scanner;

public class JobVacancyV2{
    public static void main(String[] args ){
        String nama, lulusan, jenisKelamin, posisi;
        int umur, penampilan, pengalaman;
        boolean reqkoor1, reqkoor2, reqadmin1, reqadmin2, reqadmin3, reqspv1, reqspv2;

        Scanner input = new Scanner(System.in);

        String result = "";

        System.out.println("++++ INPUT ++++");
        System.out.print("Nama: "); nama = input.next();
        System.out.print("Umur: "); umur = input.nextInt();
        System.out.print("Jenis Kelamin (pria/wanita): "); jenisKelamin = input.next();
        System.out.print("Lulusan :"); lulusan = input.next();
        System.out.print("Pengalaman :"); pengalaman = input.nextInt();
        System.out.print("Penampilan: "); penampilan = input.nextInt();
        System.out.print("Posisi yang akan dilamar \n(SPV, Admin, Koordinator): "); posisi = input.next();
        
        if (posisi.equalsIgnoreCase("koordinator")) {
            /*
                syarat :
                - pria
                - umur minimal 21 tahun dan maksimal 30 tahun
                - lulusan SMK/D3
                - pengalaman 2 tahun

                atau 
                - pria
                - umur 30 tahun keatas
                - lulusan s1
                - pengalaman minimal 5 tahun
             */

            reqkoor1 = jenisKelamin.equalsIgnoreCase("pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("smk") || lulusan.equalsIgnoreCase("d3")) && pengalaman >= 2;
            reqkoor2 = jenisKelamin.equalsIgnoreCase("pria") && umur > 30 && lulusan.equalsIgnoreCase("s1") && pengalaman >= 5;

            if (reqkoor1 || reqkoor2) {
                result = "selamat, "+ nama +". anda memenuhi syarat untuk sebagai "+posisi+" dan akan masuk ke tahap selanjutnya.";
            } else {
                result = "Maaf, "+ nama +". anda tidak memenuhi syarat untuk sebagai "+posisi+". dan tidak akan masuk ke tahap selanjutnya.";
            }
        } else if (posisi.equalsIgnoreCase("admin")) {
            /*
                syarat :
                - wanita
                - umur minimal 20 dan maksimal 25 thn
                - lulusan d3
                - penampilan menarik atau pengalaman min 1 tahun

                atau 
                - wanita
                - umur diatas 20 thn
                - lulusan s1
                - penampilan menarik
                - pengalaman min 3 tahun

                atau 
                - pria 
                - umur 20 sampai maksimal 30 
                - penampilan menarik
                - lulusan d3/s1
                - pengalaman min 2 thn
             */

            reqadmin1 = jenisKelamin.equalsIgnoreCase("wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("d3") && (penampilan >= 8 || pengalaman >= 1);
            reqadmin2 = jenisKelamin.equalsIgnoreCase("wanita") && umur > 20 && lulusan.equalsIgnoreCase("s1") && penampilan >= 8 && pengalaman >= 3;
            reqadmin3 = jenisKelamin.equalsIgnoreCase("pria") && umur >= 20 && umur <= 30 && penampilan >= 8 && (lulusan.equalsIgnoreCase("s1") || lulusan.equalsIgnoreCase("d3")) && pengalaman >= 2;

            if (reqadmin1 || reqadmin2 || reqadmin3) {
                result = "selamat, "+ nama +". anda memenuhi syarat untuk sebagai "+posisi+" dan akan masuk ke tahap selanjutnya.";
            } else {
                result = "Maaf, "+ nama +". anda tidak memenuhi syarat untuk sebagai "+posisi+". dan tidak akan masuk ke tahap selanjutnya.";
            }

        } else if (posisi.equalsIgnoreCase("spv")) {
            /*
                syarat :
                - pria atau wanita
                - umur min 23 - maks 30 th
                - lulusan s1
                - pengalaman 1 tahun

                atau
                - pria atau wanita
                - umur min 25 - maks 35
                - lulusan d3
                - pengalaman lebih dari 4 tahun
             */

            reqspv1 = (jenisKelamin.equalsIgnoreCase("pria") || jenisKelamin.equalsIgnoreCase("wanita")) && umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("s1") && pengalaman >= 1;
            reqspv2 = (jenisKelamin.equalsIgnoreCase("pria") || jenisKelamin.equalsIgnoreCase("wanita")) && umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("d3") && pengalaman > 4;

            if (reqspv1 || reqspv2) {
                result = "selamat, "+ nama +". anda memenuhi syarat untuk sebagai "+posisi+" dan akan masuk ke tahap selanjutnya.";
            } else {
                result = "Maaf, "+ nama +". anda tidak memenuhi syarat untuk sebagai "+posisi+". dan tidak akan masuk ke tahap selanjutnya.";
            }
        } else {
            result = "maaf posisi yang anda lamar tidak tersedia";
        }

        System.out.println("=== OUTPUT ===");
        System.out.println(nama + " terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut.");
        System.out.println("berikut hasil dari rekrutmen:");
        System.out.println(result);
    }
}