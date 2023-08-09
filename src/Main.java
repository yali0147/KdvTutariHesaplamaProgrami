import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvsiz, kdvTutari,kdvOrani ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Tutarı Giriniz : ");
        tutar = inp.nextDouble();
        if (tutar > 0 && tutar <= 1000) {
            kdvOrani = 0.18;
        } else if (tutar > 1000) {
            kdvOrani =0.08;
        } else {
            System.out.println("Hatalı giriş! Lütfen pozitif bir sayı giriniz.");
            return;
        }
        kdvTutari = (tutar*kdvOrani);
        kdvsiz =tutar-kdvTutari;
        System.out.println("KDV'siz Fiyat : "+kdvsiz);
        System.out.println("KDV Oranı:" +kdvOrani);
        System.out.println("KDV'li Fiyat : "+ tutar);
        System.out.println("KDV Tutarı : "+kdvTutari);

    }
}