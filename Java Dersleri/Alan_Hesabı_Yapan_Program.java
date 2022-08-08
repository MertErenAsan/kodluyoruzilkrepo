import java.util.Scanner;

public class Alan_Hesabı_Yapan_Program {
    public static void main(String[] args) {
        double aKenarı,bKenarı,cKenarı,u,alan;

        Scanner input = new Scanner(System.in);

        System.out.println("A Kenarını Giriniz : ");
        aKenarı = input.nextDouble();

        System.out.println("B Kenarını Giriniz : ");
        bKenarı = input.nextDouble();

        System.out.println("C Kenarını Giriniz : ");
        cKenarı = input.nextDouble();

        u = (aKenarı+bKenarı+cKenarı)/2;

        alan = Math.sqrt(u * (u - aKenarı)* (u - bKenarı) * (u - cKenarı));

        System.out.println(alan);


    }
}
