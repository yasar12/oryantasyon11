import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int b=a.nextInt();
        if (b%2==0){

            System.out.println("Girdiğiniz sayı çifttir");
        }
        else {
            System.out.println("Girdiğiniz sayı tektir");

        }
    }
}