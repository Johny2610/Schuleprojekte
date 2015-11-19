// Autor:   Johannes Julius Weiss
// Datum:   05.11.2015
// Version: 1.0

public class Schleifexymultiallforms {
  
  public static void main(String[] args) {
    System.out.println("// Title:   Schleifexy            //");
    System.out.println("// Autor:   Johannes Weiss        //");
    System.out.println("// Datum:   05.11.2015            //");
    System.out.println("// Version: 1.0                   //\n");
    System.out.print("Geben Sie x ein: ");
    double x = Tastatur.leseKommazahl();
    System.out.print("Geben Sie y ein: ");
    double y = Tastatur.leseKommazahl();
    double summe = 1;
    if (x <= y) {
      double a;
      double c;
      for (a = x; a <= y ;  a++ ) {
        summe = summe * a;
      }
      System.out.println("Summe1 = "+summe);
      summe = 1;
      double b = x;
      while ( b <= y ) {
        summe = summe * b;
        b++;
      }
      System.out.println("Summe2 = "+summe);
      summe = 1;
      c = x;
      do {
        summe = summe * c;
        c++;
      } while ( c <= y );
      System.out.println("Summe3 = "+summe); 
    } else {
      System.err.println("ERROR: x ist größer als y");  
    } 
    
  }
  
}
