import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("haftalardan bir gün giriniz");
        int b=a.nextInt();
        switch (b)
        {
            case 1:
                System.out.println("Bugün günlerder pazartesi");
            break;
            case 2:
                System.out.println("Bugün günlerder salı");
                break;
            case 3:
                System.out.println("Bugün günlerder çarşamba");
                break;
            case 4:
                System.out.println("Bugün günlerder perşembe");
                break;
            case 5:
                System.out.println("Bugün günlerder cuma");
                break;
            case 6:
                System.out.println("Bugün günlerder cumartesi");
                break;
            case 7:
                System.out.println("Bugün günlerder pazar");
                break;
            default:
                System.out.println("Geçerli bir değer giriniz");
        }
    }
}