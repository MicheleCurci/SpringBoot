package es1;

import java.util.Arrays;
import java.util.List;

public class Test {

	   public static void main(String args[]) {

		  Esterna est= new Esterna.EsternaBuilder("Primo", 169).setType(3).build();

	      System.out.println("Metodo della Inner Class:\n" + est.getSqrt());
	      
	      Esterna.Numbers_operations nop = new Esterna.Numbers_operations();

	      System.out.println("> Numeri dispari");
	      nop.odd_n(21);

	      System.out.println("> Somma di una lista");
	      
	      List<Integer> myList= Arrays.asList(412,100,624,364,225,275);
	      nop.sum_list(myList);


	      System.out.println("> Fibonacci");
	      nop.fibonacci_n(11);

	   }

}