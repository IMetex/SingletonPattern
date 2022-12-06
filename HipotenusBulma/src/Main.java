import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenlerimiz
        int a,b;
        double c,u;

        //Kullanıcı verileri alma
        Scanner inp = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz :");
        a = inp.nextInt();
        System.out.print("2.Kenarı Giriniz :");
        b = inp.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: "+ c);

        // ücgenin Alan Hesapı
        u = (a*b)/2;
        System.out.println("Ücgenin Cevresi: "+ u*2);
        System.out.println("Ücgenin Alanı: "+ u);





    }
}