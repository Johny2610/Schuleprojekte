// Autor:   Johannes Julius Weiss
// Datum:   15.02.2016              
// Version: 1.0

public class ListensucheMin {
                                                                                       
  public static void main(String[] args) {
    System.out.println("// Title:   Listensuche Mininum   //");
    System.out.println("// Autor:   Johannes Weiss        //");
    System.out.println("// Datum:   15.02.2016            //");
    System.out.println("// Version: 1.0                   //\n");
    int tmp = -1;
    int zahlen[]={ 4,576,57,2,678,64,73,85,93};
    int ausgabe = -1;
    
    for (int i = 0; i<9; i++){
      if (zahlen[i]<tmp){
        tmp = zahlen[i];
        ausgabe = i;
      }
      
    }
    if (ausgabe > -1){   
      System.out.println("Im Feld "+ausgabe+" steht der Minimalwert "+zahlen[ausgabe]+"!");
    } 
  }
}