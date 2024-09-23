package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O2 {

        public static void main(String[] args) {

            String melding = "Poengsum:";
            final int ANT_POENGSUMMER = 10;
            int karakter;
            for (int kar=1 ; kar <= ANT_POENGSUMMER; kar++) {
                karakter = parseInt(showInputDialog(melding));
                if (karakter >= 90 && karakter <= 100) {
                    System.out.println("A");
                } else if (karakter >= 80 && karakter <= 89) {
                    System.out.println("B");
                } else if (karakter >= 60 && karakter <= 79) {
                    System.out.println("C");
                } else if (karakter >= 50 && karakter <= 59) {
                    System.out.println("D");
                } else if (karakter >= 40 && karakter <= 49) {
                    System.out.println("E");
                } else if (karakter >= 0 && karakter <= 39) {
                    System.out.println("F");
                }

                while(karakter > 100 || karakter < 0) {
                    System.out.println("Ugyldig poengsum");
                    karakter = parseInt(showInputDialog(melding));

                }

            }

        }
}
