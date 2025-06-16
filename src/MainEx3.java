public class MainEx3 {
    public static void main(String[] args) {
        System.out.println("---------------------------- PRIMO PUNTO ----------------------------");

        double lato1 = 5.5;
        double lato2 = 3.2;
        double perimetro = perimetroRettangolo(lato1, lato2);

        System.out.println("Il perimetro del rettangolo è: " + perimetro);

        System.out.println("---------------------------- SECONDO PUNTO ----------------------------");

        int num1 = 10;
        int num2 = 5;

        System.out.println(num1 + " -> " + pariDispari(num1));
        System.out.println(num2 + " -> " + pariDispari(num2));

        System.out.println("---------------------------- TERZO PUNTO ----------------------------");

        double a = 5.0;
        double b = 6.0;
        double c = 7.0;
        double area = areaTriangolo(a, b, c);

        System.out.println("Area del triangolo: " + area);
    }

    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    public static int pariDispari(int numero) {
        boolean isPari = (numero % 2 == 0);
        return isPari ? 0 : 1;
    }

    public static double areaTriangolo(double a, double b, double c) {

        double semiPerimetro = (a + b + c) / 2.0;
        return Math.sqrt(semiPerimetro * (semiPerimetro - a) * (semiPerimetro - b) * (semiPerimetro - c));
    }
}
