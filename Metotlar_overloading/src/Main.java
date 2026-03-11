public class Main {

    static void ekranaYaz(int a) {
    System.out.println("Parametreler : " + a);
    }

    static void ekranaYaz(int a, int b) {
        System.out.println("Parametreler : " + a + " ve " + b);
    }

    static int ekranaYaz(int a, int b,int c){
        return a+b*c;
    }

    public static void main(String[] args) {
        ekranaYaz(5);
        ekranaYaz(10, 2);
        System.out.println(ekranaYaz(4,5,6));

    }



}