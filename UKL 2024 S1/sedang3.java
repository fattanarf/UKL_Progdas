import java.util.Random;
import java.util.Scanner;
public class sedang3 {
    public static void main(String[] args) {
    //MEMBUAT KUIS OPERATOR (PERKALIAN, MODULUS, PEMBAGIAN)

    //VARIABEL YANG DIBUTUHKAN
    Scanner input = new Scanner(System.in);
    Random acak = new Random();
    boolean lanjut = true;
    char operator;
    int bilangan1;
    int bilangan2;
    int jawabanbenar;
    int jawabanuser;

    //Proses
    while (lanjut) {
    // Generate bilangan acak dan operator
        bilangan1 = acak.nextInt(10) + 1;
        bilangan2 = acak.nextInt(10) + 1;
        int operatorInt = acak.nextInt(5);

        switch (operatorInt) {
            case 0:
            operator = '*';
            jawabanbenar = bilangan1 * bilangan2;
            break;

            case 1:
            operator = '/';
            jawabanbenar = bilangan1 / bilangan2;
            break;

            case 2:
            operator = '+';
            jawabanbenar = bilangan1 + bilangan2;
            break;

            case 3:
            operator = '-';
            jawabanbenar = bilangan1 - bilangan2;
            break;

            default:
            operator = '%';
            jawabanbenar = bilangan1 % bilangan2;
            }

    // Tampilkan soal
        System.out.print(bilangan1 + " " + operator + " " + bilangan2 + " = ");
        jawabanuser = input.nextInt();

    // Periksa jawaban
        if (jawabanuser == jawabanbenar) {
            System.out.println("Jawaban Anda benar!");
        } else {
            System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + jawabanbenar);
        }

    // Tanyakan apakah ingin melanjutkan
        System.out.print("Ingin melanjutkan? (y/n): ");
        String pilihan = input.next();
        lanjut = pilihan.equalsIgnoreCase("y"); //Jika jawaban pilihan y/Y, akan kembali lagi ke while (pilihan)
    }
    
        System.out.println("Terima kasih telah mengikuti kuis!");
    }
}


