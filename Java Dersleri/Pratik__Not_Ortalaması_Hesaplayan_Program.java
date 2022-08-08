import java.util.Scanner;

public class Pratik__Not_Ortalaması_Hesaplayan_Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Mat,Türk,Fiz,Kim,Müz,Tar;

        System.out.print("Matematik notunuzu giriniz ==>"+" ");
        Mat = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz ==>"+" ");
        Türk = input.nextInt();
        System.out.print("Fizik notunuzu giriniz ==>"+" ");
        Fiz = input.nextInt();
        System.out.print("Kimya notunuzu giriniz ==>"+" ");
        Kim = input.nextInt();
        System.out.print("Müzik notunuzu giriniz ==>"+" ");
        Müz = input.nextInt();
        System.out.print("Tarih notunuzu giriniz ==>"+" ");
        Tar = input.nextInt();


        boolean ortalama = ((Mat+Türk+Fiz+Kim+Müz+Tar)/6) >= 60 ;


        String sonuc = ortalama ? "sınıfı geçti" : "sınıfta kaldı";
        System.out.println(sonuc);



    }
}
