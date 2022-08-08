import java.util.Scanner;

public class Manav_Hesabı_Yapan_Program {
    public static void main(String[] args) {
        double armutKg,elmaKg,domatesKg,muzKg,patlıcakKg,Armut=2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlıcan=5.0,Tutar;
        Scanner input = new Scanner(System.in);


        System.out.print("Kaç Kg Armut Aldınız? : ");
        armutKg = input.nextDouble();

        System.out.print("Kaç Kg Elma Aldınız? : ");
        elmaKg = input.nextDouble();

        System.out.print("Kaç Kg Domates Aldınız? : ");
        domatesKg = input.nextDouble();

        System.out.print("Kaç Kg Muz Aldınız? : ");
        muzKg = input.nextDouble();

        System.out.print("Kaç Kg Patlıcan Aldınız? : ");
        patlıcakKg = input.nextDouble();

        Tutar = (armutKg*Armut)+(elmaKg*Elma)+(domatesKg*Domates)+(muzKg*Muz)+(patlıcakKg*Patlıcan);

        System.out.println("Toplam Tutar : "+ Tutar);


    }
}
