
import java.util.Random;
import java.util.Scanner; 

public class soaluklsedang3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String continueQuiz;

        do {
            // Menghasilkan dua bilangan acak
            int bilanganPertama = random.nextInt(100); // Bilangan pertama antara 0-99
            int bilanganKedua = random.nextInt(100); // Bilangan kedua antara 0-99
            int operator = random.nextInt(3); // 0 = perkalian, 1 = pembagian, 2 = modulus
            
            int jawabanBenar = 0;
            String operatorString = "";
            
            // Menentukan operator dan jawaban yang benar
            switch (operator) {
                case 0: // Perkalian
                    operatorString = "*";
                    jawabanBenar = bilanganPertama * bilanganKedua;
                    break;
                case 1: // Pembagian
                    // Pastikan bilangan kedua tidak nol
                    if(bilanganKedua==0){
                        bilanganKedua=1;
                    }
                    operatorString = "/";
                    jawabanBenar = bilanganPertama / bilanganKedua;
                    break;
                case 2: // Modulus
                    operatorString = "%";
                    jawabanBenar = bilanganPertama % bilanganKedua;
                    break;
            }

            // Menampilkan pertanyaan
            System.out.printf("%d %s %d = ?\n", bilanganPertama, operatorString, bilanganKedua);
            System.out.print("Masukkan jawaban Anda: ");
            int jawabanUser  = scanner.nextInt();

            // Memeriksa jawaban
            if (jawabanUser  == jawabanBenar) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + jawabanBenar);
            }

            // Menanyakan apakah pengguna ingin melanjutkan
            System.out.print("Apakah Anda ingin melanjutkan kuis? (ya/tidak): ");
            continueQuiz = scanner.next();
        } while (continueQuiz.equalsIgnoreCase("ya"));

        System.out.println("Terima kasih telah bermain!");
        scanner.close();
    }
}