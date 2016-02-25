// Autor:   Johannes Weiss
// Datum:   25.02.2016              
// Version: 0.9

public class binSearchTest {
  
  public static void main(String[] args) {
    Copyright.daten("Binaere Suche","25.02.2016","0.9");
    int wert;
    System.out.print("Geben Sie den gesuchten Wert ein: ");                       //gesuchter Wert setzen
    for (wert = Tastatur.leseZahl(); wert <= 0 ; wert = Tastatur.leseZahl()) {    //Fehlerhafte Eingaben verhindern
      System.err.println("ERROR: Die Eingabe ist kleiner/gleich NULL!");
      System.out.print("Geben Sie den gesuchten Wert erneut ein: ");
    }
    int zahlen[] = {1,2,3,4,5,6,7,8,9,10};                                        //Array initilalisieren
    int tmp = binSearch.search(zahlen, wert);                                     //Klasse binSearch mit der Methode search aufrufen und den return in den Integer tmp schreiben.
    if (tmp != -1){
      System.out.println("Der gesuchte Wert "+wert+" steht im Feld "+tmp);        //Ausgabe von dem Integer tmp, wenn Wert im Array
    } else if (tmp == -1) {
      System.out.println("Der gesuchte Wert "+wert+" ist nicht vorhanden");       //Ausgabe einer Fehlermeldung, wenn Wert nicht im Array
    }
  }
}
