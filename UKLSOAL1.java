/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal1;

/**
 *
 * @author NAYA
 */
import java.util.Scanner;

public class UKLSOAL1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = input.nextInt();

        boolean prima = true;
       
        if (angka < 100){
                System.out.println(angka +"ini bilangan anda kurang dari 100");
                return;
            }
            if (angka > 1000){
                System.out.println(angka +"ini bilangan anda lebih dari 1000");
                return;
            }
           

        if (angka <= 1) {
            prima = false;
        } else {
            for (int i = 2; i <= Math.sqrt(angka); i++) {
                if (angka % i == 0) {
                    prima = false;
                    break;
                }
            }
        }

        if (prima) {
            System.out.println(angka + " adalah bilangan prima");
        } else {
            System.out.println(angka + " bukan bilangan prima");
            
            }

            
            //kurang dari 100 ket ini kurang dari 100
//lebih dari 1000 keterangan lebih dari 1000
//100-1000 muncul ket bilangan prima atau bukan
    
        }
    }


