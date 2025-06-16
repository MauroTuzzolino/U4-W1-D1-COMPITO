import java.util.Scanner;

public class MainEx2 {
    public static void main(String[] args) {
        System.out.println("------------------- SCANNER -------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ciao, come ti chiami");
        String name = scanner.nextLine();

        System.out.println("Ciao, da dove vieni?");
        String city = scanner.nextLine();

        System.out.println("Ciao, che lavoro fai?");
        String job = scanner.nextLine();


        String stringaConcatenata = "Quindi tu sei " + name + ", vieni da " + city + " e la tua professione è: " + job + ". Perfetto! Piacere di conoscerti.Mau";

        System.out.println(stringaConcatenata);
    }
}
