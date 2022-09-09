import java.util.Scanner;

public class Hesap_Makinesi {
    public static void main(String[] args) {
        int a,b,islem;
        Scanner input = new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemi giriniz:\n1==> Çarpma\n2==> Bölme\n3==>Toplama\n4==>Çıkarma");
        islem = input.nextInt();
        if (islem>4){
            System.out.println("Lütfen İstediğiniz işleme karşılık gelen Sayıyı Giriniz");
            islem = input.nextInt();
        }

        System.out.print("Lütfen 1. Sayıyı Giriniz==> ");
        a = input.nextInt();
        System.out.print("Lütfen 2. Sayıyı Giriniz ==> ");
        b = input.nextInt();

        switch(islem){
            case 1:
                System.out.println(a*b);
                break;
            case 2:
                System.out.println(a/b);
                break;
            case 3:
                System.out.println(a+b);
                break;
            case 4:
                System.out.println(a-b);

        }
    }
}
