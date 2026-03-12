import java.util.Scanner;

public class Main {

    static void desen(int a, int original, int flag) {

        System.out.print(a + " ");

        if (a <= 0) {
            flag = 1;
        }

        if (a == original && flag == 1) {
            return;
        }

        if (flag == 0) {
            desen(a - 5, original, flag);
        } else {
            desen(a + 5, original, flag);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int a = input.nextInt();

        desen(a, a, 0);
    }
}