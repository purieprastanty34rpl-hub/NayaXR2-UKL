/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal6;

/**
 *
 * @author NAYA
 */
import java.util.Scanner;

public class UKLSOAL6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, judul, kategori;
        int lama, biayaPerHari = 0, denda = 0, total;

        // Input data
        System.out.print("Masukkan nama peminjam: ");
        nama = input.nextLine();

        System.out.print("Masukkan judul buku: ");
        judul = input.nextLine();

        System.out.print("Masukkan kategori buku (A / B / C): ");
        kategori = input.nextLine().toUpperCase();

        System.out.print("Masukkan lama peminjaman (hari): ");
        lama = input.nextInt();

        // Tentukan tarif berdasarkan kategori
        switch (kategori) {
            case "A":
                biayaPerHari = 2000;
                break;
            case "B":
                biayaPerHari = 1500;
                break;
            case "C":
                biayaPerHari = 1000;
                break;
            default:
                System.out.println("Kategori tidak valid!");
                return;
        }

        // Hitung biaya awal
        int biayaAwal = biayaPerHari * lama;

        // Hitung denda jika lebih dari 7 hari
        if (lama > 7) {
            denda = (lama - 7) * 500;
        }

        total = biayaAwal + denda;

        // Output hasil
        System.out.println("\n=== STRUK PEMINJAMAN BUKU ===");
        System.out.println("Nama peminjam        : " + nama);
        System.out.println("Judul buku           : " + judul);
        System.out.println("Kategori buku        : " + kategori);
        System.out.println("Lama peminjaman      : " + lama + " hari");
        System.out.println("Biaya peminjaman awal: Rp " + biayaAwal);
        System.out.println("Denda keterlambatan  : Rp " + denda);
        System.out.println("Total biaya akhir    : Rp " + total);
    }
}
