/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal5;

/**
 *
 * @author ADVAN
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UKLSOAL5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<Integer> riwayatKomputer = new ArrayList<>();
        ArrayList<Integer> riwayatPemain = new ArrayList<>();

        int skorPemain = 0;
        int skorKomputer = 0;

        System.out.println("=== PERMAINAN LEMPAR DADU ===");
        System.out.println("Siapa yang lebih beruntung? Komputer atau Pemain?");
        System.out.println("Target kemenangan: 5 poin\n");

        while (skorPemain < 5 && skorKomputer < 5) {
            System.out.print("Tekan angka/tombol apa saja untuk melempar dadu: ");
            input.next(); // tidak digunakan, hanya untuk menunggu input

            int daduKomputer = rand.nextInt(6) + 1; // 1–6
            int daduPemain = rand.nextInt(6) + 1;   // 1–6

            riwayatKomputer.add(daduKomputer);
            riwayatPemain.add(daduPemain);

            System.out.println("\nHasil lemparan:");
            System.out.println("Komputer : " + daduKomputer);
            System.out.println("Pemain   : " + daduPemain);

            if (daduPemain > daduKomputer) {
                System.out.println(">> Pemain menang di ronde ini!\n");
                skorPemain++;
            } else if (daduKomputer > daduPemain) {
                System.out.println(">> Komputer menang di ronde ini!\n");
                skorKomputer++;
            } else {
                System.out.println(">> Seri!\n");
            }

            System.out.println("Skor Sementara → Pemain: " + skorPemain + " | Komputer: " + skorKomputer);
            System.out.println("----------------------------------------------------\n");
        }

        System.out.println("=== PERMAINAN SELESAI ===");
        if (skorPemain > skorKomputer) {
            System.out.println("Pemenangnya adalah: PEMAIN!");
        } else {
            System.out.println("Pemenangnya adalah: KOMPUTER!");
        }

        System.out.println("\n=== REKAP RIWAYAT LEMPARAN ===");
        System.out.println("Riwayat lemparan Komputer : " + riwayatKomputer);
        System.out.println("Riwayat lemparan Pemain   : " + riwayatPemain);
        System.out.println("\nTotal Kemenangan → Pemain: " + skorPemain + " | Komputer: " + skorKomputer);
    }
}
