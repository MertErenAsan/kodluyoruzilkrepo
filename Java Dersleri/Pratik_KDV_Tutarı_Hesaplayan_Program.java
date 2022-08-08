import java.util.Scanner;

public class Pratik_KDV_Tutarı_Hesaplayan_Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        if (a>1000){
            System.out.println("KDV TUTARI ==>"+" "+(a*8)/100);
            System.out.println("KDV'Lİ FİYAT ==>"+" "+(a*108)/100);
        
        if (a<=1000){
            System.out.println("KDV TUTARI ==>"+" "+(a*18)/100);
            System.out.println("KDV'Lİ FİYAT ==> "+" "+(a*118)/100);
        }

        }
        
    }
    
}
