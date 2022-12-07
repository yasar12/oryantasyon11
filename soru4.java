import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int b=a.nextInt();
        if (b<0)
        {
            System.out.println("Girilen sayı negatif");

        }
        else if (b>0)
        {
            System.out.println("Girilen sayı pozitif");

        }
        else {

            System.out.println("Sayı nötr");
        }


    }
}