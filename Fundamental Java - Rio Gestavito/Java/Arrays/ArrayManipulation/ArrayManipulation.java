import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String [] args){
        int[] numbers = {7, 4, 3, 7, 10, 9, 2, 8, 2, 1, 5, 6, 7};
        int find;
        boolean kondisi = false;
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan angka yang anda cari: ");
        find = input.nextInt();

        int count = 0;
        for (int element : numbers) {
            if (element == find) {
                count += 1;
                kondisi = true;
            } 
        }
        
        if (kondisi) {
            System.out.println("angka "+find+" yang anda cari ditemukan di array numbers.");
            System.out.println("ada "+count+" angka "+find+" didalam array numbers");
            System.out.println("yaitu index ke :");
    
            for (int i=0;i<numbers.length;i++) {
                if (numbers[i] == find) {
                    System.out.print(i+",");
                    continue;
                }
            }
        } else {
            System.out.println("angka "+find+" yang anda cari tidak ditemukan di array numbers.");
        }
    }
}