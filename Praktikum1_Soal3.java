package com.RirinCitraLestari;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Praktikum1_Soal3 {
	public static void main(String[] args) throws IOException {
        // Menggunakan BufferedReader untuk input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Meminta input dari user
        System.out.print("Masukkan angka awal: ");
        int start = Integer.parseInt(reader.readLine());  // Memulai dari angka ini
        System.out.print("Masukkan jumlah bilangan ganjil yang ingin ditampilkan: ");
        int jumlahGanjil = Integer.parseInt(reader.readLine());  // Banyaknya bilangan ganjil yang ingin ditampilkan

        int count = 0;
        int current = start;

        // Menggunakan loop do-while untuk mencetak bilangan ganjil
        do {
            if (current % 2 != 0) {  // Cek apakah bilangan ganjil
                System.out.print(current + " ");
                count++;
            }
            current++;  // Lanjutkan ke bilangan berikutnya
        } while (count < jumlahGanjil);  // Loop akan berhenti setelah jumlah ganjil terpenuhi

        System.out.println();  // Tambahkan baris baru setelah deret
    }
}