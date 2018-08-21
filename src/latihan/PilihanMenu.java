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
public class PilihanMenu {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int pilihan=9;
        do{
            System.out.println("\n Menu Luas Bangun \n");
            System.out.println("1. Menghitung Luas Persegi");
            System.out.println("2. Menghitung Luas Persegi Panjang");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda : ");
            pilihan = masukan.nextInt();
            switch(pilihan) {
                case 1 : luasPersegi();
                        break;
                case 2 : luasPersegiPanjang();
                        break;
            }
        }while(pilihan != 3);
    }
        private static void luasPersegi() {
            Scanner masukan = new Scanner(System.in);
            float sisi,luas;
            System.out.print("Masukkan Nilai Sisi : ");
            sisi = masukan.nextFloat();
            luas = sisi*sisi;
            System.out.println("Luas Persegi adalah : " + luas);
        }
        private static void luasPersegiPanjang() {
            Scanner masukan = new Scanner(System.in);
            float panjang,lebar,luas;
            System.out.print("Masukkan Nilai Panjang : ");
            panjang = masukan.nextFloat();
            System.out.print("Masukkan Nilai Lebar : ");
            lebar = masukan.nextFloat();
            luas = panjang*lebar;
            System.out.println("Luas Persegi Panjang adalah : " + luas);
        }
    }
