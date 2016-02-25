// Autor:   Johannes Julius Weiss
// Datum:   12.02.2016              
// Version: 1.0

public class Listensuche {
                                                                                       
  public static void main(String[] args) {
    System.out.println("// Title:   Listensuche           //");
    System.out.println("// Autor:   Johannes Weiss        //");
    System.out.println("// Datum:   12.02.2016            //");
    System.out.println("// Version: 1.0                   //\n");
    System.out.print("Suche: ");
    int suche = Tastatur.leseZahl();
    int zahlen[]={ 1,2,3,4,5,6,7,8,9};
    int ausgabe = -1;
    for (int i = 0; i<9; i++){
      if (zahlen[i] == suche){
        ausgabe = i;
      }
      
    }
    if (ausgabe > -1){   
      System.out.println("Im Feld "+ausgabe+" steht der gesuchte Wert "+suche+"!");
    } else if(ausgabe == -1){
      System.err.println("Der gesuchte Wert "+suche+" ist nicht vorhanden");
    }
  }
}