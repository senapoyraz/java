import java.util.Scanner;

public class Main {
    static int us (int a,int b){
        if (b==0) {
            return 1;
        }

        return 2*us(2,b-1);

    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("üssünü almak istediginiz saiyiyi giriniz: ");
        int a =input.nextInt();
        System.out.println("üssünü giriniz : ");
        int b=input.nextInt();
        System.out.println("sonuc= "+ us(a,b));

    }

}