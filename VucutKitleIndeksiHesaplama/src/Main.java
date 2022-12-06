import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float boy , kilo , endeks;

        System.out.println("*** Vucut Kitle İndeksi Hesaplama ***");
        Scanner inp = new Scanner(System.in);

        System.out.print("Lüften Boyunuzu Giriniz : ");
        boy = inp.nextFloat();

        System.out.print("Lüften Kilonuzu Giriniz : ");
        kilo = inp.nextFloat();

        endeks = (kilo / (boy * boy));
        System.out.println("Vucut Kitle İndeksiniz : " + endeks);
    }
}