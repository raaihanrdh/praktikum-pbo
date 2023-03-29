/*
* MBujurSangkar.java 28 Maret 2023
* Nama         : Muhammad Raihan Ridho
* NIM          : 24060121140131
* Deskripsi    : File class implementasi untuk menghitung luas bujur sangkar
*/

 import java.util.Scanner;

 public class MBujurSangkar {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         BujurSangkar bs = new BujurSangkar();
         System.out.print("Masukan sisi bujur sangkar : ");
         double sisi = scan.nextDouble();
         System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
     }
 }
 