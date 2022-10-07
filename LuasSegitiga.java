import java.util.Scanner;
import java.util.Locale;

class LuasSegitiga {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("##  Menghitung Luas Segitiga  ##");
        System.out.println("=============================================");
        System.out.println();

        double a,t, luas;

        System.out.print("Input alas segitiga: ");
        a = input.nextDouble();

        System.out.print("Input tinggi segitiga: ");
        t = input.nextDouble();

        luas = 0.5 * a * t;

        System.out.println("Luas segitiga: "+luas);

    }
}
