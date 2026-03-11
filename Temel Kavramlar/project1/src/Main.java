//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("fizik notunuzu giriniz:");
        double fizik = input.nextDouble();
        System.out.println("kimya notunuzu giriniz:");
        double kimya = input.nextDouble();
        System.out.println("biyoloji notunuzu giriniz:");
        double biyoloji = input.nextDouble();
        System.out.println("mat notunuzu giriniz:");
        double mat = input.nextDouble();
        double ort = (fizik + kimya + biyoloji + mat) / (double) 4.0F;
        System.out.println("Not ortalamaniz: " + ort);
    }
}