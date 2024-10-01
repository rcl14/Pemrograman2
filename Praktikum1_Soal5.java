package com.RirinCitraLestari;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Praktikum1_Soal5 {
	// Deklarasi konstanta PHI
    public static final double PHI = 3.141592653589793;

    public static void main(String[] args) throws IOException {
        // Menggunakan BufferedReader untuk input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Input jari-jari
        System.out.print("Masukkan jari-jari: ");
        double jariJari = Double.parseDouble(reader.readLine());  // Membaca input dan mengkonversi ke tipe double
        
        // Input tinggi
        System.out.print("Masukkan tinggi: ");
        double tinggi = Double.parseDouble(reader.readLine());  // Membaca input dan mengkonversi ke tipe double
        
        // Perhitungan volume tabung
        double volume = PHI * jariJari * jariJari * tinggi;
        
        // Output hasil perhitungan
        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", jariJari, tinggi, volume);
    }
}
