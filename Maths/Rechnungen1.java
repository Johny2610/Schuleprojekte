/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 18.09.2015
  * @author 
  */

public class Rechnungen1 {
  
  public static void main(String[] args) {
    System.out.print("Geben Sie die erste Zahl ein: ");
    double zahl1 ;
    zahl1 =Tastatur.leseKommazahl();
    System.out.println("zahl1 ist: "+zahl1);
    System.out.print("Geben Sie die zweite Zahl ein: ");
    double zahl2 ;
    zahl2 =Tastatur.leseKommazahl();
    System.out.println("zahl2 = "+zahl2);
    double ergebnis1 ;
    double ergebnis2 ;
    double ergebnis3 ;
    double ergebnis4 ;
    ergebnis1 = zahl1+zahl2 ;
    System.out.println("zahl1 + zahl2 = "+zahl1+" + "+zahl2+" = "+ergebnis1);
    ergebnis2 = zahl1-zahl2 ;
    System.out.println("zahl1 - zahl2 = "+zahl1+" - "+zahl2+" = "+ergebnis2); 
    ergebnis3 = zahl1*zahl2 ;
    System.out.println("zahl1 * zahl2 = "+zahl1+" x "+zahl2+" = "+ergebnis3);
    if (zahl2 == 0){
      System.out.println("ERROR Divisor = 0");
    } 
    else{
      ergebnis4 = zahl1/zahl2;
      System.out.println("zahl1 / zahl2 = "+zahl1+" : "+zahl2+" = "+ergebnis4);
    }
  }  // end of main
  
} // end of class Rechnungen1
