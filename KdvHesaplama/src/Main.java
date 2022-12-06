import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tutar,kvdliTutar,kvdTutar,kvdOran1=0.18,kdvOran2=0.08;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();

        if (tutar <=1000){
            kvdTutar = tutar * kvdOran1;
            kvdliTutar = tutar + kvdTutar;
        }
        else {
            kvdTutar = tutar * kdvOran2;
            kvdliTutar = tutar + kvdTutar;
        }

        System.out.println("KDV'siz Tutar: "+tutar);
        System.out.println("KDV Tutarınız : "+ kvdTutar);
        System.out.println("KDV'li Tutarınız: "+ kvdliTutar);



    }
}