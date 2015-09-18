/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 18.09.2015
  * @author 
  */

public class Rechnungen2 {
  
  public static void main(String[] args) {
    System.out.print("Geben Sie eine Zahl ein: ");
    int zahl1 = Tastatur.leseZahl();
    System.out.println("zahl1 = "+zahl1);
    System.out.print("Geben Sie eine Zahl ein: ");
    int zahl2 = Tastatur.leseZahl();
    int ergebnis = zahl1 + zahl2;
    System.out.println(ergebnis);
    ergebnis = zahl1 - zahl2;
    System.out.println(ergebnis);
    if (zahl2 == 0) {
      System.out.println("ERROR while dividing");  
    } else {
      ergebnis = zahl1 / zahl2;
      System.out.println(ergebnis);
    } // end of if-else
    ergebnis = zahl1 * zahl2;
    System.out.println(ergebnis);
    
  } // end of main
  
} // end of class Rechnungen
