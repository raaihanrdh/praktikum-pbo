/* Nama File    : BangunDatarGeneric.java
 * Nama         : Muhammad Raihan Ridho
 * NIM          : 24060121140131
 * Deskripsi    : kelas konstruksi generic untuk BangunDatar
 */

public class BangunDatarGeneric <T extends BangunDatar>{
    private T bangunDatar;

    public void set(Lingkaran l, T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    public T get(){
        return bangunDatar;
    }
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
