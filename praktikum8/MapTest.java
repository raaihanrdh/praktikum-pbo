/* Nama File    : MapTest.java 9/5/2023
 * Nama         : Muhammad Raihan Ridho
 * NIM          : 24060121140131
 * Deskripsi    : harga harga rental kendaraan diawal perjalanan
 */

import java.util.*;

public class MapTest{
    public static void main (String[] args){
       //kunci-> integer, nilai-> string
        Map<Integer, String> map = new HashMap<Integer, String>() ;
        //menempatkan elemen kunci dan nilai
        map.put (1,"satu");
        map.put (2,"dua");
        //mengambil elemen pertama
        System.out.println (map.get (1));
        //mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key= map.keySet ();
        //bagaimana iterasi untuk mengambil keseluruhan
        // nilai dari kunci ? tulis pada laporan anda!
        // petunjuk : gunakan iterasi seperti program ArrayListTest
    }
}