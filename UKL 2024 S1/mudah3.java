import java.util.Scanner;
public class mudah3 {
    public static void main(String[] args) {
    //Membuat list data dari 50 - 1
    Scanner input = new Scanner(System.in);

    //Input yang akan dikeluarkan
    String [] kalimat = {"saya anak moklet", "saya anak wikusama", "saya angkatan 33"};
    int indeks = 0;
    
    //Proses
    System.out.print("Masukan jumlah kalimat: ");
    for(int i = input.nextInt();i >= 2;i--){
    System.out.println(i + ". " + kalimat[indeks]); //Output
    indeks = (indeks + 1) % kalimat.length;
    }
    System.out.println("1. Saya senang");
}
}