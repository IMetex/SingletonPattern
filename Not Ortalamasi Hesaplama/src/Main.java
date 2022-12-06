import java.util.Scanner;
public class Main {
    public static void main(String[] args) 
    {
        int mat,fzk,kmy,turk,trh;
        double toplam , sonuc;
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değer alma
        System.out.print("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fzk = inp.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kmy = inp.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        turk = inp.nextInt();
        System.out.print("Tarih notunuzu giriniz : ");
        trh = inp.nextInt();

        toplam = (mat + fzk + kmy + turk + trh);
        sonuc = toplam/5;

        if (sonuc<60){
            System.out.print("Kaldınız" + " " + sonuc);
        }
        else {
            System.out.print("Geçtiniz" + " " +sonuc);
        }




    }
}