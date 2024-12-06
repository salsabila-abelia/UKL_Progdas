import java.util.Scanner;

public class soaluklsulit2 {
    public static void main(String[] args) {
                // Array input
                Scanner input = new Scanner (System.in);
                System.out.println("Masukkan jumlah array yang diinputkan :");
                int bilangan = input.nextInt();
                int[] angka = new int [bilangan] ;
                for (int i = 0; i < bilangan; i++) {
                   System.out.println("masukkan angka"); 
                   angka[i] = input.nextInt();
                }
                
                // Memanggil metode untuk mengecek duplikat
                cekDuplikat(angka);
            }
        
            public static void cekDuplikat(int[] angka) {
                boolean adaDuplikat = false;
                
              

                System.out.print("Array memiliki elemen duplikat: ");
                
                // Loop pertama untuk memilih elemen
                for (int i = 0; i < angka.length; i++) {
                    // Loop kedua untuk memeriksa apakah elemen sudah ada sebelumnya
                    for (int j = i+ 1; j < angka.length; j++) {

                        if (angka[i] == angka[j]) {
                            // Jika ditemukan duplikat, cetak elemen dan beri tanda ada duplikat
                            System.out.print(angka[i] + " ");
                            adaDuplikat = true;
                            break; // Keluar dari loop kedua setelah menemukan duplikat
                        }
                    }
                }
                
                if (!adaDuplikat) { // "!" sebagai simbol bahwa tidak ada/not
                    System.out.println("Tidak ada duplikat.");
                }
            }
        }
        
