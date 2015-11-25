// Autor:   Johannes Julius Weiss
// Datum:   20.11.2015
// Version: 1.1

public class Widerstandsberechnung {
  
  public static void main(String[] args) {
    System.out.println("// Titel:   Widerstandsberechnung //");
    System.out.println("// Autor:   Johannes Weiss        //");
    System.out.println("// Erstelldatum:   19.11.2015     //");
    System.out.println("// Änderungsdatum:   20.11.2015   //");
    System.out.println("// Version: 1.1                   //\n\n");
    System.out.print("Geben Sie die Anzahl der Messreihen ein:            ");
    int anzahlMessreihen = Tastatur.leseZahl();
    if (anzahlMessreihen > 0) {
      int laufvariable = 1;
      double summeWiderstand = 0;
      double mittelwertWiderstand = 0;
      while (laufvariable <= anzahlMessreihen) { 
        System.out.print("Geben Sie die elektrische Spannung U"+laufvariable+" ein:          ");
        double spannung = Tastatur.leseKommazahl();
        System.out.print("Geben Sie die elektrische Strom I"+laufvariable+" ein:             ");
        double strom = Tastatur.leseKommazahl();
        double widerstand = spannung / strom;
        System.out.println("Der Widerstand der Messreihe "+laufvariable+" beträgt:             "+widerstand+"\n");
        summeWiderstand = summeWiderstand + widerstand;
        mittelwertWiderstand = summeWiderstand / laufvariable;
        System.out.println("Der bisherige Mittelwert der Widerstände beträgt:   "+mittelwertWiderstand+"\n");
        laufvariable++;
      }
      mittelwertWiderstand = summeWiderstand / anzahlMessreihen;
      System.out.println("Der endgültige Mittelwert des Widerstandes beträgt: "+mittelwertWiderstand);
    } else {
      System.err.println("ERROR: Anzahl der Messreihen <= 0");
    } 
  }  
}
