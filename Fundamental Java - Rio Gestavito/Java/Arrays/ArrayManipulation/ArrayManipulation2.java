import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = {7, 4, 3, 7, 10, 9, 2, 8, 2, 1, 5, 6, 7};
        int indeks, nilai_baru;
        boolean kondisi = true;

        System.out.println("merubah nilai dari array numbers");
        System.out.println("nilai dari numbers adalah: ");
        System.out.println(Arrays.toString(numbers)+"\n\n");

        do {
            System.out.print("masukan indeks yang mau di ganti 0-"+(numbers.length - 1)+": ");
            indeks = input.nextInt();

            if (indeks < numbers.length) {
                kondisi = false;
            }

        } while(kondisi);

        System.out.print("masukan nilai: ");
        nilai_baru = input.nextInt();

        numbers[indeks] = nilai_baru;
        
        System.out.println("\nnilai dari numbers adalah: \n"+Arrays.toString(numbers));




    }   
}
