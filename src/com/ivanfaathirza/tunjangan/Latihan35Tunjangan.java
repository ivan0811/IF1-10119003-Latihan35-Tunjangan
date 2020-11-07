package com.ivanfaathirza.tunjangan;

import java.util.Scanner;
/**
 *
 * @author User
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menghitung tunjangan 
 * bagi yang sudah menikah dan berbasis objek dengan 
 * instansiasi objek tunjangan
 */

public class Latihan35Tunjangan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gaji;
        String status;
        Tunjangan tunjangan = new Tunjangan();
        System.out.println("=====Program Tunjangan====");
        System.out.print("Berapa gaji anda perbulan ? \t: Rp. ");
        gaji = scan.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) \t: ");
        status = scan.next().toUpperCase();
        tunjangan.hitung(gaji, status);
        System.out.println("(Developed by : Ivan Faathirza)");
    }
}
