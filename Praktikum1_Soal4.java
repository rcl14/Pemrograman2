package com.RirinCitraLestari;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Praktikum1_Soal4 {
	// Fungsi untuk menentukan pemenang di setiap ronde
    public static String siapaMenang(char abu, char bagas) {
        if (abu == bagas) {
            return "Seri";
        } else if ((abu == 'B' && bagas == 'G') || 
                   (abu == 'G' && bagas == 'K') || 
                   (abu == 'K' && bagas == 'B')) {
            return "Abu";
        } else {
            return "Bagas";
        }
    }
    
    public static void main(String[] args) throws IOException {
        // Menggunakan BufferedReader untuk input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Input tangan Abu
        System.out.print("Tangan Abu: ");
        String tanganAbu = reader.readLine().toUpperCase();  // Mengambil input dan mengubah ke huruf besar
        
        // Input tangan Bagas
        System.out.print("Tangan Bagas: ");
        String tanganBagas = reader.readLine().toUpperCase();  // Mengambil input dan mengubah ke huruf besar
        
        // Validasi input (harus ada 3 pilihan untuk 3 ronde)
        if (tanganAbu.length() != 3 || tanganBagas.length() != 3) {
            System.out.println("Input tidak valid.");
            return;  // Keluar dari program jika input tidak valid
        }
        
        int poinAbu = 0;
        int poinBagas = 0;
        
        // Perulangan untuk setiap ronde
        for (int i = 0; i < 3; i++) {
            char abu = tanganAbu.charAt(i);    // Pilihan Abu pada ronde i
            char bagas = tanganBagas.charAt(i); // Pilihan Bagas pada ronde i
            
            String hasil = siapaMenang(abu, bagas);
            
            // Penambahan poin berdasarkan hasil
            if (hasil.equals("Abu")) {
                poinAbu++;
            } else if (hasil.equals("Bagas")) {
                poinBagas++;
            }
        }
        
        // Menentukan pemenang setelah 3 ronde
        if (poinAbu > poinBagas) {
            System.out.println("Pemenang: Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Pemenang: Bagas");
        } else {
            System.out.println("Hasil Akhir: Seri");
        }
    }
}
