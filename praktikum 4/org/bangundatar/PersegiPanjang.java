/**
* PersegiPanjang.java 20/03/2023
* Nama      : Derva Anargya Ghaly
* NIM       : 24060121140149
* Deskripsi : representasi dasar dari objek persegi panjang,turunan kelas poligon
*/

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
    private double panjang,lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println("Bangun Persegi Panjang Berisi"+ " " +this.getJumlahSisi());
    }
}