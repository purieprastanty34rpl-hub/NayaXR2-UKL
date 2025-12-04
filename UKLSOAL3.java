/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal3;

/**
 *
 * @author
 */
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class UKLSOAL3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("=== KUIS ARITMATIKA ===");
        System.out.println("Pilihan operator di kuis: ");
        System.out.println("1. Perkalian (*)");
        System.out.println("2. Pembagian (/)");
        System.out.println("3. Modulus (%)");
        System.out.println("4. Acak operator");
        

        mainLoop:
        while (true) {
            try {
                System.out.print("\nPilih operator (1-4): ");
                int pilihan = input.nextInt();
                if (pilihan == 0) {
                }
                // buat bilangan acak 1..10
                int bil1 = rand.nextInt(10) + 1; // 1-10
                int bil2 = rand.nextInt(10) + 1; // 1-10

                // array operator
                char[] operators = {'*', '/', '%'};

                // tentukan operator terpilih
                char opTerpilih;
                if (pilihan >= 1 && pilihan <= 3) {
                    opTerpilih = operators[pilihan - 1];
                } else if (pilihan == 4) {
                    opTerpilih = operators[rand.nextInt(operators.length)];
                } else {
                    System.out.println("Pilihan tidak valid. Masukkan angka 1-4.");
                    continue;
                }

                // hitung kunci jawaban (dengan penanganan khusus untuk pembagian agar sesuai integer)
                int kunciJawaban;
                switch (opTerpilih) {
                    case '*':
                        kunciJawaban = bil1 * bil2;
                        break;
                    case '/':
                        // pembagian integer, pastikan tidak membagi dengan 0 (bil2 tidak pernah 0 di sini)
                        kunciJawaban = bil1 / bil2;
                        break;
                    case '%':
                        kunciJawaban = bil1 % bil2;
                        break;
                    default:
                        // seharusnya tidak pernah terjadi
                        System.out.println("Terjadi kesalahan memilih operator.");
                        continue;
                }

                // tampilkan soal dan minta jawaban
                System.out.printf("Soal: %d %c %d = ?%n", bil1, opTerpilih, bil2);
                System.out.print("Jawaban Anda (masukkan angka integer): ");
                int jawabanUser = input.nextInt();

                // cek jawaban
                if (jawabanUser == kunciJawaban) {
                    System.out.println("Jawaban BENAR!");
                } else {
                    System.out.println("Jawaban SALAH.");
                    System.out.println("Jawaban yang benar adalah: " + kunciJawaban);
                }

                // tanya lanjut atau tidak
                System.out.print("Mau lanjut kuis? (y/n): ");
                String lanjut = input.next();
                if (!lanjut.equalsIgnoreCase("y")) {
                    System.out.println("Terima kasih, permainan selesai.");
                    break mainLoop;
                }

            } catch (InputMismatchException ime) {
                // jika user memasukkan bukan integer
                System.out.println("Input tidak valid. Masukkan angka yang benar.");
                input.nextLine();
            }
        }

        input.close();
    }
}
