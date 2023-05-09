/* Nama File    : Programmer.java 9/5/2023
 * Nama         : Muhammad Raihan Ridho
 * NIM          : 24060121140131
 * Deskripsi    : perhitungan bonus 
 */
class Programmer extends Pegawai{
	private int bonus = 450000;
	
	public Programmer(String nama) {
		this.setNama(nama);
	}
	
	public void tampilData() {
		super.tampilData();
		System.out.printf("Bonus : %d \n", this.bonus);
	}
}