/**
* Poligon.java 02/04/2014
* Nama      : Muhammad Raihan Ridho
* Deskripsi : representasi dasar dari objek poligon (segi banyak)
*/

package org.poligon;

public class Poligon {
    protected int jumlahSisi;

    public void poligon(){
        jumlahSisi = 0;
    }

    public void setJumlahSisi(int n){
        jumlahSisi = n;
    }
    public int getJumlahSisi(){
        return this.jumlahSisi;
    }
}
