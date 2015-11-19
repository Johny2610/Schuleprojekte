// Autor:   Johannes Julius Weiss
// Datum:   05.11.2015
// Version: 1.0

public class Schleife1x {
  
  public static void main(String[] args) {
    System.out.println("// Title:   Schleife1x            //");
    System.out.println("// Autor:   Johannes Weiss        //");
    System.out.println("// Datum:   05.11.2015            //");
    System.out.println("// Version: 1.0                   //\n");
    System.out.print("Geben Sie x ein: ");
    double x = Tastatur.leseKommazahl();
    double summe = 0;
    for (double i = 0; i <= x ;  i++ ) {
      summe = summe + i;
    }
    System.out.println("Summe = "+summe);
  }
  
}
