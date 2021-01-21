/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;
import java.util.Scanner;
/**
 *
 * @author Manda Salsa
 */
public class FungsiRekursif {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int bil, hasil;
        System.out.print("Masukkan Suatu Bilangan : ");
        bil = masukan.nextInt();
        hasil = faktorial(bil);
        System.out.println("Nilai Faktorial "+ bil +" adalah "+ hasil);
        
    }
    
    private static int faktorial(int a){
        if (a==1){
            //mengembalikan nilai
            return 1;
        }else {
            //mengembalikan nilai
            return (a*faktorial (a-1));
    }
    }
}