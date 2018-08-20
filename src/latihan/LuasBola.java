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
public class LuasBola {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int r;
        System.out.print("Masukkan Jari-jari Bola = ");
        r = masukan.nextInt();
        System.out.println("==============================");
        System.out.println("Menghitung Luas Permukaan Bola");
        System.out.println("==============================");
        System.out.println("Luas Permukaan Bola = " + ((float)4*22*r/7*r));  
    }
}
