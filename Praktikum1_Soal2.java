package com.RirinCitraLestari;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Praktikum1_Soal2 {
	public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Masukkan angka awal: ");
            int angka = Integer.parseInt(reader.readLine()); // Membaca input dan mengonversi ke int
            int count = 0;

            while (count < 10) {
                if (angka % 5 == 0) {
                    angka = (angka / 5) - 1;
                }
                System.out.print(angka + (count < 9 ? ", " : "")); // Menampilkan angka dan koma jika bukan angka terakhir
                angka++;
                count++;
            }
            System.out.println(); // Baris baru setelah deret selesai
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan dalam input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Harap masukkan angka.");
        }
    }
}