import java.util.Scanner;

public class soaluklsedang1 {
        
         public static long hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Faktorial dari 0 dan 1 adalah 1
        } else {
            return n * hitungFaktorial(n - 1);
            //cara kerjanya dia berputar terus hingga angka yang ada pada (n - 1) ini habis
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // memasukkan bilangan bulat positif
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        if (bilangan < 0) {
            System.out.println("Silakan masukkan bilangan bulat positif.");
        } else {
            // Menghitung dan menampilkan faktorial
            long faktorial = hitungFaktorial(bilangan);
            for (int i = 1; i <= bilangan; i++) {
                System.out.print(i + " * ");
                
            }
            System.out.println("Faktorial dari " + bilangan + " adalah: " + faktorial);
        }

    }
}
