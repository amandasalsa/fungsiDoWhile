/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author Manda Salsa
 */
public class NewClass1 {
    public static void main(String[] args) {
        int i, j;
        
        for (i = 1 ; i <= 5; i++){
        
            for (j=1; j < i; j++){
                System.out.print("@");
                
            }
            for (j=i; j<=5; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
