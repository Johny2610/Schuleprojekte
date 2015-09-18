/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 18.09.2015
  * @author 
  */

public class Rechnungen {
  
  public static void main(String[] args) {
    int zahl1;
    zahl1 = 4711;
    System.out.println("zahl1 = "+zahl1);
    int zahl2 = 8;
    int ergebnis = zahl1 + zahl2;
    System.out.println(ergebnis);
    ergebnis = zahl1 - zahl2;
    System.out.println(ergebnis);
    ergebnis = zahl1 / zahl2;
    System.out.println(ergebnis);
    ergebnis = zahl1 * zahl2;
    System.out.println(ergebnis);
    System.out.print("Geben Sie eine Zahl ein");
    zahl2 = Tastatur.leseZahl();
  } // end of main
  
} // end of class Rechnungen
