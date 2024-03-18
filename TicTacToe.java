package TicTacToe;

import Tools.IOTools;

public class TicTacToe {
    public static void main(String[] args) {

        int[][] spielfeld = new int[3][3];
        init(spielfeld, '~');
        ausgebenSpielfeld(spielfeld);

        // ausgeben();
        // eingabe();
        // gewonnen();

        int spalte = 0, zeile = 0;
        boolean gewonnen = false;
        // char[][] spielfeld = new char[3][3];
        // Spielfeld initialisieren
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // spielfeld[i][j] = '~';
        // }
        // }
        for (int zuege = 1; zuege <= 9; zuege++) {
            // Eingabe Spieler O
            do {
                spalte = IOTools.readInteger("Spieler 0: Geben sie die Spalte ein[1,2,3]: ") - 1;
                zeile = IOTools.readInteger("Spieler 0: Geben sie die Zeile ein[1,2,3]: ") - 1;
            } while (zeile > 2 || zeile < 0 || spalte > 2 || spalte < 0 || spielfeld[zeile][spalte] != '~');
            // Zug in Feld eintragen
            spielfeld[zeile][spalte] = 'O';
            // Spielfeld ausgeben
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(spielfeld[i][j]);
                }
                System.out.println();
            }
            // Spieler 0 gewonnen?
            if ( // horizontal: Zeilen prüfen
            spielfeld[0][0] == 'O' && spielfeld[0][1] == 'O' && spielfeld[0][2] == 'O' ||
                    spielfeld[1][0] == 'O' && spielfeld[1][1] == 'O' && spielfeld[1][2] == 'O' ||
                    spielfeld[2][0] == 'O' && spielfeld[2][1] == 'O' && spielfeld[2][2] == 'O' ||
                    // vertikal: Spalten prüfen
                    spielfeld[0][0] == 'O' && spielfeld[1][0] == 'O' && spielfeld[2][0] == 'O' ||
                    spielfeld[0][1] == 'O' && spielfeld[1][1] == 'O' && spielfeld[2][1] == 'O' ||
                    spielfeld[0][2] == 'O' && spielfeld[1][2] == 'O' && spielfeld[2][2] == 'O' ||
                    // Diagonalen prüfen
                    spielfeld[0][0] == 'O' && spielfeld[1][1] == 'O' && spielfeld[2][2] == 'O' ||
                    spielfeld[0][2] == 'O' && spielfeld[1][1] == 'O' && spielfeld[2][0] == 'O') {
                System.out.println("Spieler 0 hat gewonnen");
                gewonnen = true;
                break;// verlässt die umhüllende Schleife
            }
            // -----------------------------------------------------------------------------------
            // Eingabe Spieler X
            do {
                spalte = IOTools.readInteger("Spieler X: Geben sie die Spalte ein[1,2,3]: ") - 1;
                zeile = IOTools.readInteger("Spieler X: Geben sie die Zeile ein[1,2,3]: ") - 1;
            } while (zeile > 2 || zeile < 0 || spalte > 2 || spalte < 0 || spielfeld[zeile][spalte] != '~');
            // Zug in Feld eintragen
            spielfeld[zeile][spalte] = 'X';
            // Spielfeld ausgeben
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(spielfeld[i][j]);
                }
                System.out.println();
            }
            // Spieler X gewonnen?
            if ( // horizontal: Zeilen prüfen
            spielfeld[0][0] == 'X' && spielfeld[0][1] == 'X' && spielfeld[0][2] == 'X' ||
                    spielfeld[1][0] == 'X' && spielfeld[1][1] == 'X' && spielfeld[1][2] == 'X' ||
                    spielfeld[2][0] == 'X' && spielfeld[2][1] == 'X' && spielfeld[2][2] == 'X' ||
                    // vertikal: Spalten prüfen
                    spielfeld[0][0] == 'X' && spielfeld[1][0] == 'X' && spielfeld[2][0] == 'X' ||
                    spielfeld[0][1] == 'X' && spielfeld[1][1] == 'X' && spielfeld[2][1] == 'X' ||
                    spielfeld[0][2] == 'X' && spielfeld[1][2] == 'X' && spielfeld[2][2] == 'X' ||
                    // Diagonalen prüfen
                    spielfeld[0][0] == 'X' && spielfeld[1][1] == 'X' && spielfeld[2][2] == 'X' ||
                    spielfeld[0][2] == 'X' && spielfeld[1][1] == 'X' && spielfeld[2][0] == 'X') {
                System.out.println("Spieler X hat gewonnen");
                gewonnen = true;
                break;
            }
        } // end for(zuege...
        if (!gewonnen) {
            System.out.println("Spiel beendet! Es gibt keinen Gewinner");
        }
    }

    private static void init(int[][] spielfeld, int spalten) {
        for (int i = 1; i <= spalten; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void ausgebenSpielfeld(int[][] spielfeld) {
        int y = spielfeld.length;
        int x = spielfeld['~'].length;
        for (int i = 0; i < spielfeld.length; i++) {
            for (int b = 0; b < spielfeld[i].length; b++) {
                System.out.print("~");
            }

            System.out.println();
        }
    }

}