/* Nama File    : MapTest.java 
 * Nama         : Muhammad Raihan Ridho
 * NIM          : 24060121140131
 * Deskripsi    : Program implementasi penggunaan generic untuk pasangan kunci-nilai
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
        for (int i : key){
            System.out.println(i + " = " + map.get(i));
        }
    }
}