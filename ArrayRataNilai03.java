import java.util.Scanner;
public class ArrayRataNilai03{
     public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        int [] nilaiMhs = new int [10];
        int jmlMhs, jmlMhsLulus = 0, jmlMhsTidakLulus = 0;
        double totallulus = 0, totaltidaklulus = 0;
        double rata2lulus = 0, rata2tidaklulus = 0;

        System.out.println("Masukkan jumlah mahasiswa : ");
        jmlMhs = scan.nextInt();


        for (int i = 0; i < jmlMhs; i++){
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = scan.nextInt();
        }

        for (int i = 0; i < jmlMhs; i ++){
            if (nilaiMhs[i] > 70){
                totallulus += nilaiMhs[i];
                jmlMhsLulus += 1;
                rata2lulus = totallulus/jmlMhsLulus;
            } else {
                jmlMhsTidakLulus += 1;
                totaltidaklulus += nilaiMhs[i];
                rata2tidaklulus = totaltidaklulus/jmlMhsTidakLulus;
     }
}

 System.out.println("Rata-rata nilai mahasiswa yang lulus="+rata2lulus);
    
    System.out.println("Rata-rata nilai mahasiswa yang tidak lulus="+rata2tidaklulus);
}
}