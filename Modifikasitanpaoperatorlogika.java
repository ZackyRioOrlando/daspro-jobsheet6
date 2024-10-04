import java.util.Scanner;
public class Modifikasitanpaoperatorlogika{
    public static void main(String[] args){
        Scanner absen27 = new Scanner(System.in);

        int tahun;

        System.out.print("Masukkan Tahun : ");
        tahun = absen27.nextInt();

        int cekKabisat = tahun % 4;
        int cek100 = tahun % 100;
        int cek400 = tahun % 400;

        if (cekKabisat != 0) {
            System.out.println("Bukan Tahun Kabisat");
        } else if (cek100 != 0) {
            System.out.println("Tahun Kabisat");
        } else if (cek400 == 0) {
            System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
