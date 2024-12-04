import java.util.Scanner;
public class sulit1 {
    public static void main(String[] args) {
        
//MENGHITUNG RATA-RATA MURID
    Scanner input = new Scanner(System.in);

//Input yang dibutuhkan
    System.out.print("Berapa murid anda: ");
    int jumlahSiswa = input.nextInt();

//Variabel yang dibutuhkan
    double ratarata = 0;
    int totalNilai = 0;
    int nilai = 0;

//Proses
    for(int i = 1; i <= jumlahSiswa; i++){
    System.out.print("Nilai murid ke- " + i + " : ");
        if (i <= jumlahSiswa) {
        nilai = input.nextInt();
        totalNilai += nilai; //Bertugas menotal semua nilai yang telah di input
        }
        
    }
//Proses mencari rata-rata
    ratarata = totalNilai / jumlahSiswa;
    System.out.println("Rata-rata nilai dari murid sebanyak " + jumlahSiswa + " : " + ratarata);

    }
}
