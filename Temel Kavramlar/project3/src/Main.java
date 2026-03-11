import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. dik kenar uzunlugunu giriniz :");
        int a = input.nextInt();
        System.out.println("ikinci dik kenar uzunlugunu giriniz : ");
        int b=input.nextInt();
        double c ;
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("hipotenüs : "+c);

    }
}
