/*
* MLingkaran.java 28 Maret 2023
* Nama         : Muhammad Raihan Ridho
* NIM          : 24060121140131
* Deskripsi    : File implementasi cara mengihtung luas lingkaran
 */

 import java.util.Scanner;

 public class MLingkaran {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("Masukan panjang jari-jari lingkaran : ");
         double jari = scan.nextDouble();
         Lingkaran lr = new Lingkaran(jari);
         System.out.println("Luas lingkaran dengan jejari " + jari + " satuan adalah : " + lr.hitungLuas());
     }
 }
 