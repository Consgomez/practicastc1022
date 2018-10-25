import java.util.*;
public class NumeroPerfecto{
  public static void main (String [] args){
    //variables
    int numero = 0, counter = 0, perfecto = 0, suma = 0;
    Scanner kb = new Scanner (System.in);
    //codigo
    System.out.println ("Dame un numero para ver si es un Natural Perfecto o no");
    numero = kb.nextInt();
    perfecto = numero;
    for (counter = 2; numero>1; counter++){
      if (perfecto%counter == 0){
        numero = (perfecto/counter);
        suma = suma+numero;
      }
    } //end for
    if (suma == perfecto){
      System.out.println (perfecto + " es un número perfecto");
    }
    else {
      System.out.println (perfecto + " no es un número perfecto");
    }
  } //end main
} //end class
