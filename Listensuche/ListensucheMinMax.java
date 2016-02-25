// Autor:   Johannes Julius Weiss
// Datum:   15.02.2016              
// Version: 1.0

public class ListensucheMinMax {
  
  public static void main(String[] args) {
    System.out.println("// Title:   Listensuche Min&Max   //");
    System.out.println("// Autor:   Johannes Weiss        //");
    System.out.println("// Datum:   15.02.2016            //");
    System.out.println("// Version: 1.0                   //\n");
    System.out.print("Geben Sie die Anzahl der Felder ein: ");
    int array;
    for (array = Tastatur.leseZahl(); array <= 0; array = Tastatur.leseZahl()){
      System.err.print("Die eingegebene Anzahl ist <= 0! ");
      System.out.print("Geben Sie eine neue Anzahl ein: ");
    }
    int zahlen[] = new int [array];
    for (int i = 0; i < array; i++){
      zahlen[i]= (int) (5+35*Math.random());
    }
    int tmpMax = -1;
    int ausgabeMax = -1;
    for (int j = 0; j < array; j++){
      if (zahlen[j] > tmpMax){
        tmpMax = zahlen[j];
        ausgabeMax = j;
      }
    }
    int ausgabeMin = -1;
    int tmpMin = zahlen[ausgabeMax];
    for (int k = 0; k < array; k++){
      if (zahlen[k] < tmpMin){
        tmpMin = zahlen[k];
        ausgabeMin = k;
      }
      
    }
    if (ausgabeMin != -1 && ausgabeMax != -1){
      if (ausgabeMin != ausgabeMax){   
        System.out.println("Im Feld "+ausgabeMin+" steht der Minimalwert "+zahlen[ausgabeMin]+"!");
        System.out.println("Im Feld "+ausgabeMax+" steht der Maximalwert "+zahlen[ausgabeMax]+"!");
      }
    } 
  }
}