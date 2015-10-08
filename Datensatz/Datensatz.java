// Autor:   Johannes Julius Weiss
// Datum:   30.09.2015
// Version: 1.1

public class Datensatz {
  
  public static void main(String[] args) {
    System.out.println("// Title:   Datensatz             //");
    System.out.println("// Autor:   Johannes Weiss        //");
    System.out.println("// Datum:   30.09.2015            //");
    System.out.println("// Version: 1.1                   //\n");
    System.out.println("Bitte geben Sie Ihre Daten ein!");
    System.out.print("Nachname:   ");
    String nachname;
    nachname = Tastatur.leseText();
    System.out.print("Vorname:    ");
    String vorname;
    vorname = Tastatur.leseText();
    System.out.print("Geburtstag: ");
    String geburtstag;
    geburtstag = Tastatur.leseText();
    System.out.print("Alter:      ");
    int alter;
    alter = Tastatur.leseZahl();
    System.out.print("Gewicht:    ");
    double gewicht;
    gewicht = Tastatur.leseKommazahl();
    System.out.print("Länge:      ");
    double laenge;
    laenge = Tastatur.leseKommazahl();
    System.out.print("Augenfarbe: ");
    String augenfarbe;
    augenfarbe = Tastatur.leseText();
    
    try {
      System.out.println("[ Transmitting Data to GOOGLE.COM ]");
      System.out.println("[********** Please wait **********]");
      int wait;
      wait = 10;
      while (wait<=100) { 
        Thread.sleep(300);
        System.out.print("[ "+wait+"% ]");
        Thread.sleep(50);
        System.out.print(" .");
        Thread.sleep(50);
        System.out.print(".");
        Thread.sleep(50);
        System.out.print(".\n");
        wait = wait + 5;
      } // end of while
      System.out.println("[***********   Finished!   ***********]\n");
      System.out.println("[ FOLLOWING DATA HAS BEEN TRANSMITTED ]\n");
      System.out.println("Name:       "+vorname+" "+nachname);
      System.out.println("Birthday:   "+geburtstag);
      System.out.println("Age:        "+alter);
      System.out.println("Weight:     "+gewicht);
      System.out.println("Height:     "+laenge);
      System.out.println("Eye Color:  "+augenfarbe);
      String url = "http://www.google.com/";
      new ProcessBuilder( "rundll32", "url.dll,FileProtocolHandler", url ).start();
    } catch(Exception e) {
      
    } finally {
      
    } // end of try
    
    
  } // end of main
  
} // end of class Kreisberechnung
