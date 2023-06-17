/*
* File : LambdaMap.java
* Nama : Muhammad Raihan Ridho
* NIM  : 24060121140131
* Deskripsi : implementasi lambda pada Map
*/ 

import java.util.*;

public class LambdaMap {
    public static void main(String[] args) {
        Map<Integer,String> mahasiswa = new HashMap<Integer,String>();
        mahasiswa.put(40131, "Muhammad Raihan Ridho Khoslarudwarifar");
    
        mahasiswa.forEach((nim,nama) -> System.out.println("NIM: "+ nim +", Nama: "+ mahasiswa.get(nim)));
    }
}
