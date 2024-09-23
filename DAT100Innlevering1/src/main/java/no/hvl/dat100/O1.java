package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O1 {

        public static void main(String[] args) {
            String skatt = showInputDialog("Bruttoinntekt:");
            double tall = parseInt(skatt);

            double trinnskattProsent1 = 0.017;
            double trinnskattProsent2 = 0.04;
            double trinnskattProsent3 = 0.136;
            double trinnskattProsent4 = 0.166;
            double trinnskattProsent5 = 0.176;

            System.out.print("Trinnskatt: ");

            if (tall <=  208050 && tall >= 0) {
                System.out.println(tall);
            } else if (tall >= 208051 && tall <= 292850) {
                System.out.println(tall * trinnskattProsent1);
            } else if (tall >= 292851 && tall <= 670000) {
                System.out.println(tall * trinnskattProsent2);
            } else if (tall >= 670001 && tall <= 937900) {
                System.out.println(tall * trinnskattProsent3);
            } else if(tall >= 937901 && tall <= 1350000){
                System.out.println(tall * trinnskattProsent4);
            } else if (tall >= 1350001) {
                System.out.println(tall * trinnskattProsent5);
            }
        }
}
