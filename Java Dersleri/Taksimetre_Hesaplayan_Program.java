import java.util.Scanner;

public class Taksimetre_Hesaplayan_Program {
    public static void main(String[] args) {
        double Km,Tutar,Sonuc,Açılış = 10;
        boolean sorgu;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç km yol gidilecek : ");
        Km = input.nextDouble();

        sorgu = (Km* 2.20)+10 >= 20;

        Sonuc = sorgu ? ((Km*2.20)+10) : 20;

        System.out.println("Ödemeniz : "+ Sonuc);

    }
}
