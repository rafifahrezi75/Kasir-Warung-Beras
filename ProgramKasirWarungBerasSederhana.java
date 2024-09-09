/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programkasirwarungberassederhana;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author RAFI
 */
public class ProgramKasirWarungBerasSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        System.out.println("##  Program Kasir Warung Beras Sederhana  ##");
        System.out.println();
        
        double jmlhberas, hargaperkg, totalbiaya, totalbiayadiskon, bayar, kembali;
        
        System.out.print("Masukkan Jumlah Beras (KG) : ");
        jmlhberas = input.nextInt();
        
        System.out.print("Masukkan Harga Beras Per (KG) : Rp.");
        hargaperkg = input.nextInt();
        
        totalbiaya = jmlhberas * hargaperkg;
        
        totalbiayadiskon = totalbiaya - (totalbiaya * 5/100);
        
        System.out.println("Total Biaya : " + kursIndonesia.format(totalbiaya));
        System.out.println("Total Biaya Setelah Diskon : " + kursIndonesia.format(totalbiayadiskon));
        
        System.out.print("Masukkan Nominal Uang Pelanggan : Rp.");
        bayar = input.nextInt();
        
        kembali = bayar - totalbiayadiskon;
        
        System.out.println("Nominal Kembalian : " + kursIndonesia.format(kembali));
    }
}
