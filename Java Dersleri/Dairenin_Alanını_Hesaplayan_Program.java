import java.util.Scanner;

public class Dairenin_Alanını_Hesaplayan_Program {
    public static void main(String[] args) {
        double alan,r,a,pi=3.14;
        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz : ");
        r = inp.nextDouble();

        System.out.print("Alanını Öğrenmek İstediğiniz Dairenin Merkez Açısını Giriniz : ");
        a = inp.nextDouble();
        a /= 360;


        alan = pi*r*r*a;
        System.out.print("Öğrenmek İstediğini Dairenin Alanı : " + alan);



    }
}
