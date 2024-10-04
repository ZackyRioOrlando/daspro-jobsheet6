import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String merek, kategori;
        byte ukuran;
        double harga = 0;

        System.out.print("Masukkan merek sepatu (Specs/910/Ortus) = ");
        merek = sc.nextLine();

        if (merek.equalsIgnoreCase("Specs")) {
            System.out.print("Masukkan Kategori sepatu (Slip on/High top) = ");
            kategori= sc.nextLine();

            if (kategori.equalsIgnoreCase("Slip on")) {
                System.out.print("Masukkan Ukuran Sepatu = ");
                ukuran= sc.nextByte();
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                        System.out.println("Harga Rp." + harga);
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else if (kategori.equalsIgnoreCase("High Top")) {
                System.out.print("Masukkan Ukuran Sepatu = ");
                ukuran= sc.nextByte();
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                        System.out.println("Harga Rp." + harga);
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else
              System.out.println("Kategori tidak tersedia");
        } else if (merek.equalsIgnoreCase("910")) {
            System.out.print("Masukkan Kategori sepatu (Woman/Man) = ");
            kategori= sc.nextLine();

            if (kategori.equalsIgnoreCase("Woman")) {
                System.out.print("Masukkan Ukuran Sepatu = ");
                ukuran= sc.nextByte();
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                        System.out.println("Harga Rp." + harga);
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else if (kategori.equalsIgnoreCase("Man")) {
                System.out.print("Masukkan Ukuran Sepatu = ");
                ukuran= sc.nextByte();
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                        System.out.println("Harga Rp." + harga);
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else
              System.out.println("Kategori tidak tersedia");
        } else if (merek.equalsIgnoreCase("Ortus")) {
            System.out.print("Masukkan Kategori sepatu (Kids/Adult) = ");
            kategori= sc.nextLine();

            if (kategori.equalsIgnoreCase("Kids")) {
                System.out.print("Masukkan Ukuran Sepatu =");
                ukuran= sc.nextByte();
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                        System.out.println("Harga Rp." + harga);
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else if (kategori.equalsIgnoreCase("Adult")) {
                System.out.print("Masukkan Ukuran Sepatu = ");
                ukuran= sc.nextByte();
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                        System.out.println("Harga Rp." + harga);
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                }
            } else
              System.out.println("Kategori tidak tersedia");
        } else
          System.out.println("Merek tidak tersedia");
    } 
}
