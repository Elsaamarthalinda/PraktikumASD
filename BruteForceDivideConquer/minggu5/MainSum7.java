package BruteForceDivideConquer.minggu5;
import java.util.Scanner;
public class MainSum7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Sum7 sm = new Sum7(elemen);
        for(int i=0; i<elemen; i++){
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Brufeforce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conuquer: "+sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}