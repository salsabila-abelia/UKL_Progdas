public class soaluklmudah3 {
    public static void main(String[] args) {
              
                String[] nama = {"anak moklet", "anak wikusama", "angkatan 33"};
        
               
                for (int i = 20; i <= 45; i++) {
                    // Jika i adalah 1, jadi outputnya "saya senang"
                
                    if (i == 1) {
                        System.out.println(i + ". saya senang");
                    } else {
                        int a = i % 3;
                       
                        System.out.println(i + ". saya " + nama[a]);
                    }
                }
            }
        }
         