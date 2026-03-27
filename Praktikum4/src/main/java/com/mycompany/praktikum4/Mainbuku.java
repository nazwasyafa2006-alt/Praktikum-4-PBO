/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4;

/**
 *
 * @author user
 */

import java.util.*;
public class Mainbuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Buku> listBuku = new ArrayList<>();

        try {
            System.out.print("Masukkan id: ");
            String id = sc.nextLine();

            System.out.print("Masukkan judul: ");
            String judul = sc.nextLine();

            System.out.print("Masukkan tahun terbit: ");
            int tahun = sc.nextInt();

            Buku b = new Buku(id, judul, tahun);
            listBuku.add(b);

        } catch (InputMismatchException e) {
            System.out.println("Error: Inputan tahun harus angka!!");
        }

        for (Buku b : listBuku) {
            System.out.println(b.getId()+" - "+b.getJudul()+" - "+b.getTahunTerbit());
        }
    }
}
