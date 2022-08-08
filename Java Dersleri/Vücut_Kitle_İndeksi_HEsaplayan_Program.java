import java.util.Scanner;

public class Vücut_Kitle_İndeksi_HEsaplayan_Program {
    public static void main(String[] args) {

        double kilo,boy,vK;
        Scanner input = new Scanner(System.in);


        System.out.print("Kilonuzu Giriniz (kg) : ");
        kilo = input.nextDouble();

        System.out.print("Boyunuzu Giriniz (cm) : ");
        boy = input.nextDouble();
        boy /= 100;

        vK = kilo/(boy*boy);

        System.out.print("Vücut Kitle İndeksiniz : "+vK);


    }
}
