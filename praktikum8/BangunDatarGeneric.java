/* Nama File    : BangunDatarGeneric.java 9/5/2023
 * Nama         : Muhammad Raihan Ridho
 * NIM          : 24060121140131
 * Deskripsi    : harga harga rental kendaraan diawal perjalanan
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
    public void set(Lingkaran l) {
    }
}
