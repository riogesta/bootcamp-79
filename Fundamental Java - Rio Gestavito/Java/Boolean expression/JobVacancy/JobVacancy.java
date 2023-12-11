import java.util.Scanner;

public class JobVacancy{
    public static void main(String [] args){
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jenisKelamin;
        boolean reqkoor1, reqkoor2, reqadmin1, reqadmin2;
        
        Scanner input = new Scanner(System.in);

        System.out.print("nama : ");
        nama = input.nextLine();

        System.out.print("umur : ");
        umur = input.nextInt();

        System.out.print("jenis kelamin : (pria/wanita) ");
        jenisKelamin = input.next();

        System.out.print("lulusan (smk/d3/s1) : ");
        lulusan = input.next();

        System.out.print("pengalaman : ");
        pengalaman = input.nextInt();

        System.out.print("penampilan : ");
        penampilan = input.nextDouble();

        // persyaratan koordinator
        /*
            pria
            umur minimal 21 maksimal 30 thn
            lulusan smk/d3
            pengalaman minimal 2 thn
        
            atau
        
            pria
            umur 30 tahun keatas
            lulusan s1
            pengalaman minimal 5 tahun
         */

        reqkoor1 = jenisKelamin.equalsIgnoreCase("pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("smk") || lulusan.equalsIgnoreCase("d3")) && pengalaman >= 2;

        reqkoor2 = jenisKelamin.equalsIgnoreCase("pria") && umur >= 30 && lulusan.equalsIgnoreCase("s1") && pengalaman >= 5;

         // persyaratan admin
         /*
            wanita
            umur minimal 20 dan maksimal 25 thn
            lulusan d3
            penampilan menarik atau pengelaman minimal 1 thn
        
            atau 

            wanita
            umur diatas 25 thn
            lulusan s1
            penampilan menarik
            pengalaman minimal 3 thn
          */

        reqadmin1 = jenisKelamin.equalsIgnoreCase("wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("d3") && (pengalaman >= 1 || penampilan >= 8.5);

        reqadmin2 = jenisKelamin.equalsIgnoreCase("wanita") && umur > 25 && lulusan.equalsIgnoreCase("s1") && penampilan >= 8.5 && pengalaman >= 3;


        System.out.println("\n\n"+ nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut 79.\n");
        System.out.println("berikut adalah hasil dari rekrutmen untuk koordinator dan admin:");
        System.out.println("hasil kelulusan untuk koordinator: " + (reqkoor1 || reqkoor2));
        System.out.println("hasil kelulusan untuk admin: " + (reqadmin1 || reqadmin2));
    }
}