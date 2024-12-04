import java.util.Scanner;
//MEMBUAT SISTEM EKSPEDISI
public class mudah1 {
    public static void dibutuhkan(int beratpaket, int jarak, int p, int t, int l) {
    //Variabel yang dibutuhkan (tanpa input)
    int hargajarak1 = 4250;
    int hargajarak2 = 6000;
    int jarakminimum = 10;
    int volumeminimum = 100;
    int hargavolume = 50000;

    //rumus volume
    int volume = p*l*t;

    //Proses perhitungsn
    if (jarak <= jarakminimum) {
        int biaya1 = beratpaket * hargajarak1;
        if (volume > volumeminimum ) {
            int totalTambahan1 = biaya1 + hargavolume;
            System.out.println("Dikarenakan volume barang kamu melebihi 100, maka biaya yang kamu keluarkan: " + totalTambahan1);
        }else{
            System.out.println("Volume kamu tidak mencapai 100, biaya yang kamu keluarkan: " + biaya1);
        }
        
    }else if (jarak >= jarakminimum) {
        int biaya2 = beratpaket * hargajarak2;
        if (volume > volumeminimum) {
            int totalTambahan2 = biaya2 + hargavolume;
            System.out.println("Dikarenakan volume barang kamu melebihi 100, maka biaya yang kamu keluarkan: " + totalTambahan2);
        }else{
            System.out.println("Volume kamu tidak mencapai 100, biaya yang kamu keluarkan: " + biaya2);
        }

    }
}
        
    public static void main(String[] args) {
    //Input yang dibutuhkan (berat, jarak & volume. Harga perKG)
    Scanner input = new Scanner(System.in);

    //Input berat barang paket
    System.out.print("Masukan berat paket anda: ");
    int beratpaket = input.nextInt();

    //Input jarak yang ditempuh
    System.out.print("Masukan jarak paket anda: ");
    int jarak = input.nextInt();

    //Input untuk volume
    System.out.print("Masukan panjang paket anda: ");
    int p = input.nextInt();

    System.out.print("Masukan lebar paket anda: ");
    int l = input.nextInt();

    System.out.print("Masukan tinggi paket anda: ");
    int t = input.nextInt();

    //Variabel yang dibutuhkan (dari user), ditaruh belakang karena harus di isi terlebih dahulu
    dibutuhkan(beratpaket, jarak, p, t, l);
   
    }
}