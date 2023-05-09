/* Nama File    : Sewa.java 9/5/2023
 * Nama         : Muhammad Raihan Ridho
 * NIM          : 24060121140131
 * Deskripsi    : harga harga rental kendaraan diawal perjalanan
 */
public class Sewa {
	public static void main(String[] args) {
		Vehicle kendaraan = new Vehicle();
		Vehicle mobil = new Car();
		Vehicle bis = new Bus();
		kendaraan.calRent(50, 1000);
		mobil.calRent(50, 1000);
		bis.calRent(50, 1000);
	}
}
