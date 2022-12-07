import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int b=a.nextInt();
        int top=0;
        for (int i=0;i<b;i++){
            top=i+top;


        }
        System.out.println(top);
    }
}