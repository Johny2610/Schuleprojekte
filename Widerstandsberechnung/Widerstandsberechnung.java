// Autor:   Johannes Julius Weiss
// Datum:   19.11.2015
// Version: 1.0

public class Widerstandsberechnung {
  
  public static void main(String[] args) {
    System.out.println("// Title:   Widerstandsberechnung //");
    System.out.println("// Autor:   Johannes Weiss        //");
    System.out.println("// Datum:   19.11.2015            //");
    System.out.println("// Version: 1.0                   //\n\n");
    System.out.print("Geben Sie die Anzahl der Messreihen ein:           ");
    int x = Tastatur.leseZahl();
    if (x > 0) {
      int laufvariable = 1;
      double summeWiderstand = 0;
      double mittelwertWiderstand = 0;
      while (laufvariable <= x) { 
        System.out.print("Geben Sie die elektrische Spannung U"+laufvariable+" ein:         ");
        double spannung = Tastatur.leseKommazahl();
        System.out.print("Geben Sie die elektrische Strom I"+laufvariable+" ein:            ");
        double strom = Tastatur.leseKommazahl();
        double widerstand = spannung / strom;
        System.out.println("Der Widerstand der Messreihe "+laufvariable+" beträgt:            "+widerstand+"\n");
        summeWiderstand = summeWiderstand + widerstand;
        mittelwertWiderstand = summeWiderstand / laufvariable;
        System.out.println("Der bisherige Mittelwert der Widerstände beträgt:  "+mittelwertWiderstand+"\n");
        laufvariable++;
      }
      System.out.println("Der endgueltige Mittelwert des Widerstandes beträgt: "+mittelwertWiderstand);
    } else {
      System.err.println("ERROR: Anzahl der Messreihen <= 0");
    } 
  }  
}
