public class MainEx1 {
    public static void main(String[] args) {
        System.out.println("---------------------------- PRIMO PUNTO ----------------------------");

        int primoValore = 5;
        int secondoValore = 8;


        int risultato1 = moltiplicare(primoValore, secondoValore);
        System.out.println("Il risultato è: " + risultato1);

        System.out.println("---------------------------- SECONDO PUNTO ----------------------------");

        int valoreIntero = 20;
        String testo = "Numero scelto: ";

        String risultato2 = concatenare(valoreIntero, testo);
        System.out.println(risultato2);

        System.out.println("---------------------------- TERZO PUNTO ----------------------------");

        String[] animali = {"cane, gatto, pappagallo, pesce, coniglio"};
        String animaleExtra = "criceto";

        String[] arrayFinale = inserisciInArray(animali, animaleExtra);
        for (int i = 0; i < arrayFinale.length; i++) {
            System.out.println(arrayFinale[i]);
        }


    }

    //Metodo moltiplicare
    public static int moltiplicare(int valoreA, int valoreB) {
        return valoreA * valoreB;
    }

    //Metodo Concatenare
    public static String concatenare(int numero, String testo) {
        return testo + numero;
    }

    //Metodo Array
    public static String[] inserisciInArray(String[] array, String extra) {
        int posizione = 2;

        String[] nuovoArray = new String[array.length + 1];

        for (int i = 0; i < posizione; i++) {
            nuovoArray[i] = array[i];
        }

        nuovoArray[posizione] = extra;

        for (int i = posizione; i < array.length; i++) {
            nuovoArray[i + 1] = array[i];
        }
        return nuovoArray;
    }
}
