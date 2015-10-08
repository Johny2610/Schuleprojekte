public class Ringberechnung {
  
  public static void main(String[] args) {
    System.out.println("Berechnung der Fläche eines Ringes");
    System.out.println("==================================\n");
    System.out.print("Bitte geben Sie den Außenradius der Ringes ein: ");
    double aussenradius;
    aussenradius = Tastatur.leseKommazahl();
    if (aussenradius > 0) {
      System.out.print("Bitte geben Sie den Innenradius der Ringes ein: ");
      double innenradius;
      innenradius = Tastatur.leseKommazahl();
      if (innenradius > 0) {
        if (aussenradius > innenradius) {
          double innenflaeche;
          double aussenflaeche;
          double pi = Math.PI;
          double ringflaeche;
          innenflaeche = Math.pow(innenradius, 2) * pi;
          aussenflaeche = Math.pow(aussenradius, 2) * pi;
          ringflaeche = aussenflaeche - innenradius;
          System.out.println("Die Ringflaeche beträgt: "+ringflaeche);
        } else {
          System.err.println("ERROR: Der Innenradius ist gleich oder größer als der Außenradius");  
        }
      } else {
        System.err.println("ERROR: Der Innenradius ist negative oder gleich 0");  
      }
    } else {
      System.err.println("ERROR: Der Außenradius ist negative oder gleich 0");  
    }
    
  }
  
}
