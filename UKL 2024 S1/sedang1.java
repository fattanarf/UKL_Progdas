import java.util.Scanner;
public class sedang1 {
    public static void main(String[] args) {
    
    //MEMBUAT FAKTORIAL PADA BILANGAN POSITIF
    Scanner input = new Scanner(System.in);

    //Input
    System.out.println("Menghitung kelipatan");
    System.out.print("Masukan bilangan: ");
    int bilangan = input.nextInt();
    long faktorial = 1; //Mengapa long, karena jika int tidak kuat untuk menghitung angka sebanyak itu

    //Proses
    System.out.print("Faktorial dari " + bilangan + "! = " );
    for (int i = bilangan; i >= 1; i--){
        System.out.print(i);
        if (i > 1) {
            System.out.print(" X ");
        }
    //Operasi
    faktorial *= i;
    }

    //Output
    System.out.println( " = " + faktorial);


    }
    
}
