/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal2;

/**
 *
 * @author NAYA
 */
import java.util.Scanner;
public class UKLSOAL2 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Masukkan jumlah uang (Rupiah): ");                                                        
       int uang = input.nextInt();
       
       if (uang > 99999){
           System.out.println("Uang anda kelebihan");
           return;
       }

       int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000};

       for (int p : pecahan) {
       int jumlah = uang / p; 
       if (jumlah > 0) {
       System.out.println(jumlah + " Lembar " + p);
       uang = uang % p;   
       }
        }
    }
}

    

