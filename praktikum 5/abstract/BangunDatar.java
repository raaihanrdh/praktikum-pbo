/*
* BangunDatar.java 28 Maret 2023
* Nama         : Muhammad Raihan Ridho
* NIM          : 24060121140131
* Deskripsi    : File abstract class bangun datar
*/

 public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l) {
        luas = l;
    }

    public double getLuas() {
        return luas;
    }
}