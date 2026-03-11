import java.util.Scanner;
public class Main{
    static boolean asal(int a,int b) {
        if (a<2) {
            return false;
        }

        if(b==1){
            return true;
        }

        if(a%b!=0){
        return asal(a,b-1);
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println(" bir sayi giriniz : ");
        int a=input.nextInt();
        if (asal(a,a-1)){
            System.out.println("giridiginiz sayi asaldir ");
        }
        else{
            System.out.println("girdiginiz sayi asal degildir ");
        }

    }
}