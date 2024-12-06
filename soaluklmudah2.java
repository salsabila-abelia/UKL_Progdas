// SOAL UKL MUDAH NO 2

import java.util.Scanner;

public class soaluklmudah2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("masukkan angka");
        int i =  scanner.nextInt();
        int j=i%2;
        if (j>0){
            System.out.println("ganjil");
        }else{
            System.out.println("genap");
        }
        

    }
}