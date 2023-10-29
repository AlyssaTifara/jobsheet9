import java.util.Scanner;
public class LinearSearch03{
    public static void main(String[] args){
        Scanner input03 = new Scanner (System.in);

        int key, array, hasil = 0;

        System.out.println("Masukkan jumlah elemen array");
        array = input03.nextInt();
        
        int [] arrayInt = new int [array];

        for (int i = 0; i < arrayInt.length; i++){
            System.out.print("Masukkan elemen array ke-" + i + ":");
            arrayInt[i] = input03.nextInt();
        }

        System.out.print("Masukkan key yang dicari: ");
        key = input03.nextInt();

        for (int i = 0; i < arrayInt.length; i++){
             if (arrayInt[i] == key){
                hasil = i;
            }
        }

        if (hasil < 0){
             System.out.println("Key ada dalam array pada posisi indeks ke-" +hasil);
        } else {
            System.out.println("Key yang dicari tidak ditemukan");
        }
        
        }
    }
