// Autor:   Johannes Julius Weiss
// Datum:   05.11.2015
// Version: 1.0

public class Schleifexy {
  
  public static void main(String[] args) {
    System.out.println("// Title:   Schleifexy            //");
    System.out.println("// Autor:   Johannes Weiss        //");
    System.out.println("// Datum:   05.11.2015            //");
    System.out.println("// Version: 1.0                   //\n");
    System.out.print("Geben Sie x ein: ");
    double x = Tastatur.leseKommazahl();
    System.out.print("Geben Sie y ein: ");
    double y = Tastatur.leseKommazahl();
    double summe = 0;
    if (x <= y) {
      for (double i = x; i <= y ;  i++ ) {
      summe = summe + i;
      }
      System.out.println("Summe = "+summe); 
    } else {
      System.err.println("ERROR: x ist größer als y");  
    } 
    
  }
  
}
