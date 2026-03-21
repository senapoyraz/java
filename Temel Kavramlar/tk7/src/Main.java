import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("kac kg armut aldıniz: ");
        float armut =input.nextFloat();
        System.out.println("kac kg elma aldıniz: ");
        float elma =input.nextFloat();
        System.out.println("kac kg domates aldıniz: ");
        float domates =input.nextFloat();
        System.out.println("kac kg muz aldıniz: ");
        float muz =input.nextFloat();
        System.out.println("kac kg patlican aldıniz: ");
        float patlican =input.nextFloat();
        float toplam=(armut*2.64f)+(elma*3.67f)+(domates*1.11f)+(muz*0.95f)+(patlican*5.0f);
        System.out.println("toplam tuatar = "+toplam);


    }
}