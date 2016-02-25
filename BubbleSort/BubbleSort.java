// Autor:   Marco Block
// Datum:   16.02.2016              
// Version: 0.1
// Quelle: http://www.java-uni.de/index.php?Seite=85 (Alle Rechte vorbehalten)
// Bearbeiter: Johannes Weiss
    
public class BubbleSort { 
  public static void sort(int[] x) {
    boolean unsort=true;//Die Zahlen sind unsortiert -> wahr
    int tmp;            //Deklaration temporäre Variable
    
    while (unsort){ //solange unsort -> wahr führe aus
      unsort = false; // unsort -> falsch
      for (int i = 0; i < x.length-1; i++) //for-Schleife mit Lv i bis Länge von x-1; Schrittweite 1
      if (x[i] > x[i+1]) { //Wenn das Feld x[i] größer ist als das nachfolgende führe aus:                     
        tmp = x[i];        //x[i] in den temporären Speicher
        x[i] = x[i+1];     //x[i] überschreiben mit dem größeren Wert
        x[i+1] = tmp;      //x[i+1] überschreiben mit dem kleineren Wert aus dem tmp. Speicher
        unsort = true;     //Die Liste ist wieder unsortiert, also unsort -> wahr
      }          
    } 
  }
  
  public static void main(String[] args) {
    System.out.println("// Title:   BubbleSort            //");
    System.out.println("// Autor:   Marco Block           //");
    System.out.println("// Bearbeiter: Johannes Weiss     //");
    System.out.println("// Datum:   16.02.2016            //");
    System.out.println("// Version: 0.1                   //\n");
    int liste[] = new int [50000];               //Initalisierung des Arrays "liste" mit 9 Feldern
    for (int i = 0; i < liste.length;i++){   //for-Schleife mit Lv i bis Länge von dem array "liste"; Schrittweite 1
      liste[i]= (int) (1+35*Math.random());  //Array liste[i] mit dem Zufallwert "1+36*ZUFALL" füllen
    } 
    sort(liste);                             //Methode sort(x) aufrufen
    for (int i=0; i < liste.length; i++){    //for-Schleife mit Lv i bis Länge von dem array "liste"; Schrittweite 1
      
      System.out.print(liste[i]+" ");        //Ausgabe der sortierten Werte
    } 
  }
}                                                                                 