package com.RirinCitraLestari;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Praktikum1_Soal1 {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = reader.readLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = reader.readLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = Integer.parseInt(reader.readLine());

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = Integer.parseInt(reader.readLine());

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = Integer.parseInt(reader.readLine());

        System.out.print("Masukkan Tinggi Badan (cm): ");
        int tinggiBadan = Integer.parseInt(reader.readLine());

        System.out.print("Masukkan Berat Badan (kg): ");
        double beratBadan = Double.parseDouble(reader.readLine());

        // Output hasil
        System.out.println();
        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + 
                           " pada Tanggal " + tanggalLahir + " " + getNamaBulan(bulanLahir) + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");
    }

    public static String getNamaBulan(int bulan) {
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                              "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        if (bulan >= 1 && bulan <= 12) {
            return namaBulan[bulan - 1];
        } else {
            return "Bulan tidak valid";
        }
    }
}