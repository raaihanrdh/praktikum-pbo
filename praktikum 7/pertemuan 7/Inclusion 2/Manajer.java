/* Nama File    : Manajer.java 8/5/2023
 * Nama         : Muhammad Raihan Ridho
 * NIM          : 24060121140131
 * Deskripsi    : manajer turunan dari pegawai
 */

class Manajer extends Pegawai{
	private int tunjangan = 700000;
	
	public Manajer(String nama) {
		this.setNama(nama);
	}
	
	public void tampilData() {
		super.tampilData();
		System.out.printf("Tunjangan : %d \n", this.tunjangan);
	}
}