import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("kac km yol gittiniz : ");
        float km = input.nextFloat();
        float ucret= km*2.20f;
        if(ucret<=20){
            ucret=30;
        }
        else {
            ucret=ucret+10;
        }
        System.out.println("taksimetre: "+ucret);

    }
}
