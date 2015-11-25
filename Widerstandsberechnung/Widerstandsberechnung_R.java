// Autor:   Johannes Julius Weiss
// Datum:   25.11.2015
// Version: 1.0

public class Widerstandsberechnung_R {
  
  public static void main(String[] args) {
    System.out.println("// Titel:   Widerstandsberechnung                           //");
    System.out.println("// Autor:   Johannes Weiss                                  //");
    System.out.println("// Datum:   25.11.2015                                      //");
    System.out.println("// Version: 1.0                                             //");
    System.out.println("// Andere Projekte unter github.com/Johny2610/Schulprojekte //\n\n");
    System.out.print("Geben Sie die Anzahl der Messreihen ein:            ");
    int anzahlMessreihen = Tastatur.leseZahl();
    if (anzahlMessreihen > 0) {
      double summeWiderstand = 0;
      double mittelwertWiderstand = 0;
      for (int laufvariable = 1; laufvariable <= anzahlMessreihen; laufvariable++) { 
        System.out.print("Geben Sie den elek. Widerstand R"+laufvariable+" ein:              ");
        double widerstand = Tastatur.leseKommazahl();                                                                                    
        summeWiderstand = summeWiderstand + widerstand;
        mittelwertWiderstand = summeWiderstand / laufvariable;
        System.out.println("Der bisherige Mittelwert der Widerstände beträgt:   "+mittelwertWiderstand+"\n");
      }
      mittelwertWiderstand = summeWiderstand / anzahlMessreihen;
      System.out.println("Der endgültige Mittelwert des Widerstandes beträgt: "+mittelwertWiderstand);
    } else {
      System.err.println("ERROR: Anzahl der Messreihen <= 0");
    } 
  }  
}
