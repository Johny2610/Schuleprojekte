/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 01.10.2015
  * @author 
  */

public class QuadratischeGleichung {
  
  public static void main(String[] args) {
    
    System.out.println("Lösung einer quadratischen Gleichung:\nx^2 + pq + q = 0");
    System.out.print("Eingabe p: ");
    double p;
    p = Tastatur.leseKommazahl();
    System.out.print("Eingabe q: ");
    double q;
    q = Tastatur.leseKommazahl();
    double operationWurzel;
    operationWurzel = Math.pow(p/2, 2) - q;
    
    if (operationWurzel < 0) {
      System.out.println("Es gibt keine Nullstellen");
    } else if (operationWurzel == 0) {
      double ergebnis0;
      ergebnis0 = -0.5 * p;
      System.out.println("Es gibt eine Nullstelle: "+ergebnis0);  
    } else {
      double ergebnis1;
      double ergebnis2;
      ergebnis1 = -0.5 * p + Math.sqrt(operationWurzel);
      ergebnis2 = -0.5 * p - Math.sqrt(operationWurzel);
      System.out.println("Es gibt 2 Nullstellen: "+ergebnis1+" ; "+ergebnis2);
    } 
    
  }
  
}