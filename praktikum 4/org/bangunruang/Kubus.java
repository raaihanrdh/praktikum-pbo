/**
* Kubus.java 20/03/2023
* Nama      : Muhammad Raihan Ridho
* Deskripsi : Kelas yang berisi program untuk kelas Kubus
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar alas){
        this.permukaan = alas;
    }

    public double hitungVolume(){
        return permukaan.getPanjangSisi() * permukaan.hitungLuas();
    }

    public double hitungLuasAlas(){
        return permukaan.hitungLuas();
    }
}
