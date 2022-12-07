import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner a=new Scanner(System.in);
       System.out.println("Bir ay giriniz");
        String b=a.next();
        switch (b)
        {
            case "Ocak":
                System.out.println("Kış ayındasınız");
                break;
            case "Şubat":
                System.out.println("Kış ayındasınız");
                break;
            case "Aralık":
                System.out.println("Kış ayındasınız");
                break;
            case "Mart":
                System.out.println("ilkbahar ayındasınız");
                break;
            case "Nisan":
                System.out.println("ilkbahar ayındasınız");
                break;
            case "Mayıs":
                System.out.println("ilkbahar ayındasınız");
                break;
            case "Haziran":
                System.out.println("Yaz ayındasınız");
                break;
            case "Temmuz":
                System.out.println("Yaz ayındasınız");
                break;
            case "Ağustos":
                System.out.println("Yaz ayındasınız");
                break;
            case "Eylül":
                System.out.println("sonbahar");
                break;
            case "Ekim":
                System.out.println("sonbahar");
                break;
            case "Kasım":
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("Lütfen geçerli bir değer giriniz");





        }
    }
}