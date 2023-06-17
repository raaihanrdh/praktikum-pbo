/* Nama File    : Lingkaran.java 
* Nama         : Muhammad Raihan Ridho
* NIM          : 24060121140131
* Deskripsi    : Implementasi lingkaran sebagai BangunDatar
*/
public class Lingkaran extends BangunDatar{
    private double jejari;
    
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}
