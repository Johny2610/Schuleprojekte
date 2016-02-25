// Autor:   Johannes Weiss
// Datum:   25.02.2016              
// Version: 0.9

public class binSearch {
  
  public static int search (int[] x, int wert) {//Übernahme des Arrays x und der Variable wert aus der Klasse binSearchTest
    int lG = 0;                                 //linke Grenze null setzen
    int rG = x[x.length - 1];                   //rechte Grenze Länge des Arrays - 1 setzen;
    int mitte = (lG + rG) / 2;                  //Mitte errechnen aus dem Mittelwert beider Grenzen
    int temp = -1;                              //1. temporäre Variable für den Fortlauf der for-Schleife
    int tmp = -1;                               //2. temporäre Variable für die Speicherung der Position
    for (int i = 0; i > temp ; i++ ) {          //for-Schleife mit Laufvariable i = 0 bis temp größer/gleich mit Schrittweite +1
      if (x[mitte] == wert) {                   //Abfrage: Ist der Wert aus Feld mitte gleich dem gesuchten Wert wert?
        temp = i + 2;                           //temp auf i + 2 setzen, um die for-Schleife zu beenden
        tmp = mitte;                            //Abspeichern der Position des gesuchten Wertes in tmp
      } else if (x[mitte] > wert){              //Abfrage: Ist der Wert aus Feld mitte größer als der gesuchten Wert wert?
        rG = mitte - 1;                         //Rechte Grenze verschieben auf das linke Feld neben der Mitte mitte, da die Mitte mitte bereits ausgeschlossen ist.
        mitte = (lG + rG)/2;                    //Neuberechnung der Mitte aus dem Mittelwert der Grenzen
      } else if (x[mitte] < wert){              //Abfrage: Ist der Wert aus Feld mitte kleiner als der gesuchten Wert wert?
        lG = mitte + 1;                         //Rechte Grenze verschieben auf das rechte Feld neben der Mitte mitte, da die Mitte mitte bereits ausgeschlossen ist.
        mitte = (lG + rG)/2;                    //Neuberechnung der Mitte aus dem Mittelwert der Grenzen
      }
    }
    return tmp;                                 //Rückgabe der Position des gesuchten Wertes an die Klasse binSearchTest
  } 
} 
