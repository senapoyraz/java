import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("para degerini giriniz:");
        int a = input.nextInt();
        System.out.println("kdv szi paraniz :"+a);
        int b=a+(a*18)/100;
        System.out.println("kdv li paraniz: "+b);
        int c= (a*18)/100;
        System.out.println("kdv : "+c);


    }
}