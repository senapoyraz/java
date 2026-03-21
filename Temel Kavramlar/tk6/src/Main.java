import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("boyunuzu giriniz (örn: 1,60 ): ");
        double boy = input.nextDouble();

        System.out.println("kilonuzu giriniz: ");
        double kilo = input.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.printf("Vücut kitle indeksiniz: %.2f", vki);

        if(vki < 18.5){
            System.out.println(" (Zayıf)");
        }
        else if(vki < 25){
            System.out.println(" (Normal)");
        }
        else if(vki < 30){
            System.out.println(" (Fazla kilolu)");
        }
        else{
            System.out.println(" (Obez)");
        }
    }
}