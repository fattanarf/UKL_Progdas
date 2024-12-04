import java.util.Scanner;
public class sulit3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.print("Masukan jumlah bilangan: ");
       int jumlahBilangan = input.nextInt();
       int [] bilangan = new int[jumlahBilangan];

       for(int i = 0; i < jumlahBilangan; i++){
        bilangan[i] = input.nextInt();
       }
        

        int[] sekali = new int[bilangan.length]; // Array untuk menyimpan angka yang hanya muncul sekal
        int[] beberapaKali = new int[bilangan.length];   // Array untuk menyimpan angka yang muncul beberapa kali
        int indeks = 0;

        // Mencari elemen unik dan menghitung frekuensinya
        for (int i = 0; i < bilangan.length; i++) {
            boolean jawaban = false;

            for (int j = 0; j < indeks; j++) {
                if (bilangan[i] == sekali[j]) {
                    beberapaKali[j]++;
                    jawaban = true;
                    break;
                }
                
            } if (!jawaban) {
                sekali[indeks] = bilangan[i];
                beberapaKali[indeks] = 1;
                indeks++;
            }
        }

        // Menampilkan hasil
        for (int i = 0; i < indeks; i++) {
            System.out.println(sekali[i] + " muncul " + beberapaKali[i] + " kali");
        }
    }
}

 
