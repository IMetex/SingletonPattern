import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        double pi = 3.14 ,alan, cevre, merkez, alanp;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yarıcapını Giriniz: ");
        r = inp.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Cevresi : "+ cevre);
        
        System.out.print("Merkez olcusunu giriniz : ");
        merkez = inp.nextInt();

        alanp = (pi * (r*r)*merkez)/360;

        System.out.println("Daire Diliminin Alani : " + alanp);



    }
}
