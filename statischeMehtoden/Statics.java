package Java.statischeMehtoden;

public class Statics {
    public static void main(String[] args) {

        ausgabe(3, 4, '*');

        // Methoden mit Returns
        boolean ergibnis = check(10, 20);
        System.out.println(ergibnis);

        /// tiki taki uga buga cock
        char[][] spielfeld = new char[3][3];
        initialize(spielfeld, '~');
        ausgabespielfeld(spielfeld);

    }

    private static void ausgabespielfeld(char[][] spielfeld) {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                System.out.print(spielfeld[i][j] + " ");
            }
            System.out.println("");
        }

    }

    private static void initialize(char[][] spielfeld, char c) {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++)
                spielfeld[i][j] = c;
        }

    }

    private static void ausgabe(int zeilen, int spalten, char c) {
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static boolean check(int a, int b) {
        if (a > b) {
            return true;
        }
        return false;
    }
}
