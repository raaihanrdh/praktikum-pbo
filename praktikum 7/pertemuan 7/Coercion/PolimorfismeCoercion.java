/* Nama File    : PolimorfismeCoercion.java 9/5/2023
 * Nama         : Muhammad Raihan Ridho
 * NIM          : 24060121140131
 * Deskripsi    : penggunaan polimorfisme coercion 

 */
public class PolimorfismeCoercion {

    public static int kuadrat(int bilangan) {
        return bilangan*bilangan;
    }
    public static void main(String[] args) {
        //deklarasi objek integer
        Integer bilangan = 10;
        //objek integer 'dipaksa' untuk diubah
        //meniadi primitif
        int hasilKuadrat = kuadrat (bilangan);
    
        System.out.printf("Hasil kuadrat %d adalah %d",
            bilangan, 
            hasilKuadrat);
    }
}