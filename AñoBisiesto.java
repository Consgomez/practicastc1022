import java.util.*;
public class AñoBisiesto{
  public static void main (String [] args){
      //variables
      int year = 0;
      Scanner kb = new Scanner (System.in);
      //code
      System.out.println ("Escribe un año para saber si es bisiesto o no");
      year = kb.nextInt();
      if (year%4 == 0){
        if (year%100 == 0){
          if (year%400 == 0){
            System.out.println (year + " es año bisiesto");
          }
          else {
          System.out.println (year + " no es año bisiesto");
          } //end no if
        }
      }
      else {
        System.out.println (year + " no es año bisiesto");
      }
  } //end main
} //end class
