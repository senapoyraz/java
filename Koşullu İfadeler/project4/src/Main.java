import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        Scanner input= new Scanner(System.in);
        System.out.println("kullanıcı adinizi giriniz: ");
        String username = input.nextLine();
        System.out.println("sifrenizi giriniz: ");
        String password =input.nextLine();

        if(username.equals("sena") && !password.equals("123") ){
            System.out.println("şifre yanlis");
            System.out.println("sifrenizi degismek ister misinz: evet/hayır ");
            String a=input.nextLine();
                if(a.equalsIgnoreCase("evet")){
                    System.out.println("eski sifrenizden farklı bir sifre giriniz : ");
                    String new_password = input.nextLine();
                    if(password.equals(new_password)){
                        System.out.println("sifre olustrulamadi .");
                    }
                    else{
                        System.out.println("sifre olusturuldu ! ");
                        password=new_password;
                    }

                    

                    
                }
        }
        else{
            System.out.println("basarili giris yaptiniz");
        }

    }
}