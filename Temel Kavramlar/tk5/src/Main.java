import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("dairenin yari capini giriniz : ");
        float r =input.nextFloat();
        float alan= 3.14f*r*r;
        float cevre=2*3.14f*r;
        System.out.println("dairenin alanı : "+alan );
        System.out.println("dairenin cevresi :"+cevre);

    }
}

