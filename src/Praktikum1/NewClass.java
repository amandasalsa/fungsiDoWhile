/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author Manda Salsa
 */
public class NewClass {
    public static void main(String[] args) {
        int bil=4;
        
            //membuat baris vertikal
            for (int i=1; i <= bil; i++){
            if (i !=1 && i !=bil){
            for (int j=1; j <= bil ; j++){
            if (j>1 && j<bil){
                System.out.print(" ");    
            }
                else
            {
                System.out.print("@");
                    }
                }
             }
            else
            {
                for (int x=1; x <= bil ; x++)
                {
                    System.out.print("@");
                }
            }
                System.out.println("");
            }
    }
}
    
                
              
       
