/// Autor: Johannes Julius Weiss
// Datum: 24.09.2015
// Version: 0.1

public class Kreisberechnung {
  
  public static void main(String[] args) {
    System.out.println("// Title: Kreisberechnung       //");
    System.out.println("// Autor: Johannes Weiss        //");
    System.out.println("// Datum: 24.09.2015            //");
    System.out.println("// Version: 0.1                 //");
    System.out.println("");
    System.out.println("Bitte geben Sie den Radius r des Kreis ein!");
    System.out.print("r = ");
    double radius;
    radius = Tastatur.leseKommazahl();
    if (radius>=0) {
      double pi;
      double durchmesser;
      double umfang;
      double flaeche;
      
      pi = Math.PI;
      durchmesser = radius * 2;
      umfang = durchmesser * pi;
      flaeche = Math.pow(radius, 2) * pi;
      
      System.out.println("Der Durchmesser des Kreis beträgt: d = "+durchmesser);
      System.out.println("Der Umfang des Kreis beträgt:      U = "+umfang);
      System.out.println("Die Fläche des Kreis beträgt:      A = "+flaeche);
    } // end of if
    else {
      System.err.println("ERROR: Radius is negative!");
    } // end of if-else
    
  } // end of main
  
} // end of class Kreisberechnung

