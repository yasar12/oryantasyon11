import java.lang.reflect.Field;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner a=new Scanner(System.in);
System.out.println("B sayısını giriniz");
int b=a.nextInt();
        System.out.println("C sayısını giriniz");
        int c=a.nextInt();
        if (b<c){
            System.out.println("C sayısı daha büyüktür");


        }
        else if (c<b){
            System.out.println("b sayısı daha büyüktür");

        }
        else
        {
            System.out.println("iki sayıda eşittir");

        }

    }
}