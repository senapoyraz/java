import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        double fizik,kimya,mat,biyoloji,ort;
        System.out.println("fizik notunuzu giriniz:");
        fizik=input.nextDouble();
        System.out.println("kimya notunuzu giriniz:");
        kimya=input.nextDouble();
        System.out.println("biyoloji notunuzu giriniz:");
        biyoloji=input.nextDouble();
        System.out.println("mat notunuzu giriniz:");
        mat=input.nextDouble();
        ort=(fizik+kimya+biyoloji+mat)/4;
        System.out.println("Not ortalamaniz: "+ort);




    }
}


