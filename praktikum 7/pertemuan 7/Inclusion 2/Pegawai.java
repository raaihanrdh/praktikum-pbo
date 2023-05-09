/* Nama File    : Pegawai.java 9/5/2023
 * Nama         : Muhammad Raihan Ridho
 * NIM          : 24060121140131
 * Deskripsi    : bus turunan class vehicle
 */
class Pegawai {
	private String nama;
	private int gajiPokok = 5000000;
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public void tampilData() {
		System.out.printf("Nama : %s, Gaji Pokok : %d \n",
				this.nama,this.gajiPokok);
	}
}