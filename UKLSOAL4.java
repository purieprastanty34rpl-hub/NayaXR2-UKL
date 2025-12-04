/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal4;

/**
 *
 * @author ADVAN
 */
public class UKLSOAL4 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 2, 5};
        boolean ditemukan = false;

        System.out.print("Array memiliki elemen duplikat: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    ditemukan = true;
                    break; // Hentikan setelah menemukan duplikat pertama
                }
            }
            if (ditemukan) {
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada elemen duplikat.");
        }
    }
}
