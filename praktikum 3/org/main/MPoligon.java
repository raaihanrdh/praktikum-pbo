/**
 * File         : MPoligon.java 08/03/2023
 * Penulis      : Muhammad Raiha Ridho
 * Deskripsi    : Driver class untuk poligon dan persegi panjang
 */

 package org.main;

 import org.bangundatar.*;
 
 public class MPoligon{
     public static void main(String[] args){
         PersegiPanjang persegi = new PersegiPanjang(10,10,4);
         persegi.printInfo();
         System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
     }
 }
