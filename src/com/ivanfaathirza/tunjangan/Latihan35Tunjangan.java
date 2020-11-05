package com.ivanfaathirza.tunjangan;

import java.util.Scanner;

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
