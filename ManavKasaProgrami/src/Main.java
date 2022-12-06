import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kilo;
        float priceArmut = 2.14f,
                priceElma = 3.67f,
                priceDomato = 1.11f,
                priceMuz =0.95f,
                pricePatlican = 5,
                total;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç Kilo Armut ?");
        kilo = inp.nextInt();
        total = kilo * priceArmut;

        System.out.println("Kaç Kilo Domates ?");
        kilo = inp.nextInt();
        total += kilo * priceDomato;

        System.out.println("Kaç Kilo Elma ?");
        kilo = inp.nextInt();
        total += kilo * priceElma;

        System.out.println("Kaç Kilo Muz ?");
        kilo = inp.nextInt();
        total += kilo * priceMuz;

        System.out.println("Kaç Kilo Patlıcan ?");
        kilo = inp.nextInt();
        total += kilo * pricePatlican;

        System.out.println("Alışveriz Tutarınız :" + total);

    }
}