import java.util.Scanner;
public class Latihan1tanpaoperatorlogika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bil1, bil2, bil3;

        System.out.print("Masukkan Bilangan 1 : ");
        bil1 = sc.nextDouble();
        System.out.print("Masukkan Bilangan 2 : ");
        bil2 = sc.nextDouble();
        System.out.print("Masukkan Bilangan 3 : ");
        bil3 = sc.nextDouble();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.print(" Bilangan 1 adalah Bilangan Terbesar : " + bil1);
            } else
            System.out.print(" Bilangan 3 adalah Bilangan Terbesar : " + bil3);
        } else if ( bil2 > bil3 ) {
            System.out.print(" Bilangan 2 adalah Bilangan Terbesar : " + bil2);
        } else
        System.out.print(" Bilangan 3 adalah Bilangan Terbesar : " + bil3);
    }
}
