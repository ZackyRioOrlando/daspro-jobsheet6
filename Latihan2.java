import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisBuku;
        int totalDiskon = 0;
        int jumlahBuku;

        System.out.print("Masukkan jenis buku (Kamus/Novel/dll) : ");
        jenisBuku = sc.nextLine();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            totalDiskon += 10;
            System.out.println("Anda mendapatkan diskon = 10%");
            System.out.print("Masukkan jumlah buku : ");
            jumlahBuku = sc.nextInt();
            if (jumlahBuku > 2) {
                totalDiskon += 2;
                System.out.println("Anda mendapatkan mendapat tambahan diskon = 2%");
                System.out.println("Total diskon yang Anda dapatkan = " + totalDiskon + "%");
            }else 
            System.out.println("Anda tetap mendapatkan diskon = 10%");
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            totalDiskon += 7;
            System.out.println("Anda mendapatkan diskon = 7%");
            System.out.print("Masukkan jumlah buku : ");
            jumlahBuku = sc.nextInt();
            if (jumlahBuku > 3) {
                totalDiskon += 2;
                System.out.println("Anda mendapatkan tambahan diskon = 2%");
                System.out.println("Total diskon yang Anda dapatkan = " + totalDiskon + "%");
           } else if (jumlahBuku <= 3) {
           totalDiskon += 1;
           System.out.println("Anda mendapatkan diskon = 1%");
           System.out.println("Total diskon yang Anda dapatkan = " + totalDiskon + "%");
           }else {
           System.out.println("Anda tetap mendapatkan diskon = 7%");
           }
        } else {
            System.out.print("Masukkan jumlah buku : ");
            jumlahBuku = sc.nextInt();
            if (jumlahBuku > 3) {
            totalDiskon += 5;
            System.out.println("Anda mendapatkan diskon = 5%");
            }else {
                System.out.println("Anda tidak mendapatkan diskon");
            }
        }
    }
}
