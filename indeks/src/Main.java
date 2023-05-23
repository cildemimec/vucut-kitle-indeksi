import java.util.Scanner ;

public class Main {
    public static void main (String[] args) {



        Scanner scan = new Scanner(System.in);

        System.out.print("lütfen boyunuzu metre cinsinden giriniz :" );
        double boy = scan.nextDouble();
        System.out.print("lütfen kilonuzu kg cinsinden giriniz  :" );
        double kilo = scan.nextDouble();

        double  vucutKitleIndeksi = kilo/ (boy * boy);

        System.out.println("Vücut kitle indeksiniz :" + vucutKitleIndeksi);


    }
}
