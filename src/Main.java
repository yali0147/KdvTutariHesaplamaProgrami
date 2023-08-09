import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdvli, tutar, kdvTutari,kdvOrani ;

        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Lütfen Tutarı Giriniz : ");
            tutar = inp.nextDouble();

        }
        if ((tutar > 0) && (tutar <= 1000))
            kdvOrani = 0.18;
        else if (tutar > 1000)
            kdvOrani = 0.08;
        else {
            System.out.println("Hatalı giriş! Lütfen pozitif bir sayı giriniz.");
            return;
        }

        kdvTutari = (tutar*kdvOrani);
        kdvli =tutar+kdvTutari;

        System.out.println("KDV'siz Tutar : "+tutar);
        System.out.println("KDV Oranı : " +kdvOrani);
        System.out.println("KDV'li Tutar : "+ kdvli);
        System.out.println("KDV Tutarı : "+kdvTutari);

    }
}