import java.util.Scanner;

public class MainEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------- PRIMO PUNTO ----------------------------");

        System.out.print("Inserisci la lunghezza del primo lato del rettangolo: ");
        double lato1 = scanner.nextDouble();

        System.out.print("Inserisci la lunghezza del secondo lato del rettangolo: ");
        double lato2 = scanner.nextDouble();

        double perimetro = perimetroRettangolo(lato1, lato2);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);

        System.out.println("---------------------------- SECONDO PUNTO ----------------------------");

        System.out.print("Inserisci il primo numero intero: ");
        int num1 = scanner.nextInt();

        System.out.print("Inserisci il secondo numero intero: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + " -> " + pariDispari(num1));
        System.out.println(num2 + " -> " + pariDispari(num2));

        System.out.println("---------------------------- TERZO PUNTO ----------------------------");

        System.out.print("Inserisci la lunghezza del primo lato del triangolo: ");
        double a = scanner.nextDouble();

        System.out.print("Inserisci la lunghezza del secondo lato del triangolo: ");
        double b = scanner.nextDouble();

        System.out.print("Inserisci la lunghezza del terzo lato del triangolo: ");
        double c = scanner.nextDouble();

        double area = areaTriangolo(a, b, c);
        System.out.println("Area del triangolo: " + area);

        scanner.close();
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
