import java.util.Scanner;
public class soaluklsulit3 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("masukkan jumlah array");
        int a = input.nextInt();


        // Contoh array
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("masukkan nilai array ke-" + (i+1));
            array[i] = input.nextInt();
            }

    
        int[] angka = new int[a];
        int[] frequencies = new int[a];
        int U = 0;

        // Menghitung frekuensi setiap elemen
        for (int i = 0; i < a; i++) {
            boolean found = false;

            for (int j = 0; j < U; j++) {
                if (array[i] == angka[j]) {
                    frequencies[j]++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                angka[U] = array[i];
                frequencies[U] = 1;
                U++;
            }
        }
        // untuk menampilkan angka dan frekuensi munculnya
        System.out.println("Frekuensi kemunculan angka:");
        for (int i = 0; i < U; i++) {
            System.out.println(angka[i] + " muncul " + frequencies[i] + " kali");
        }
    }
}
