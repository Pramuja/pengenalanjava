/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Biodata {
    public static void main(String[] args) {
       Scanner masukan = new Scanner(System.in);
       String nama, nis , temp_lhr, tgl_lhr, jk, alamat, motto;
        System.out.println();
        System.out.print("Biodata");
        System.out.println();
        System.out.print("Nama : ");
        nama = masukan.nextLine();
        System.out.print("NIS : ");
        nis = masukan.nextLine();
        System.out.print("Tempat Lahir : ");
        temp_lhr = masukan.nextLine();
        System.out.print("Tanggal Lahir : ");
        tgl_lhr = masukan.nextLine();
        System.out.print("Jenis Kelamin : ");
        jk = masukan.nextLine();
        System.out.print("Alamat di Malang : ");
        alamat = masukan.nextLine();
        System.out.print("Motto : ");
        motto = masukan.nextLine();
    }
}
