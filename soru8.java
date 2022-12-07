import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz");
        int b=a.nextInt();
        System.out.println("final notunuzu giriniz");
        int c=a.nextInt();
        double d=b*0.4;
        double f=c*0.6;
        double ort=d+f;
        System.out.println(ort);
    }
}