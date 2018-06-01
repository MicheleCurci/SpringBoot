package es1;

import java.util.stream.Stream;
import java.util.List;
import java.util.stream.IntStream;

public class Esterna {

	private String name;
	private double value;
	private int type;

	/* COSTRUTTORE STANDARD
	Esterna(double value){
		this.value= value;
	}*/

	private Esterna(EsternaBuilder builder){
		this.name= builder.name;
		this.value= builder.value;
		this.type= builder.type;

	}

	// BUILDER PATTERN - CONSTRUCTOR
	public static class EsternaBuilder{

		private String name;
		private double value;

		//opzionale
		private int type;

		public EsternaBuilder(String name, double value){
			this.name = name;
			this.value = value;
		}
		
		public EsternaBuilder setType(int type){
			this.type= type;
			return this;
		}
		
		public Esterna build() {
			return new Esterna(this);
		}

	}

	// inner class
	private class Interna {
		public double calc() {
			return Math.sqrt(value);
		}
	}
	
	// Accesso alla inner class
	double getSqrt() {
		Interna inter= new Interna();
	return inter.calc();
	}
	
	static class Numbers_operations{
		public void fibonacci_n(int n) {
			System.out.println("### FIBONACCI dei primi "+n+" valori");	   
			Stream.iterate(new long[] {1, 1}, f -> new long[] {f[1], f[0] + f[1]})
			.limit(n).forEach(x -> System.out.println(x[0]));
		}

		public void odd_n(int n) {
			IntStream.rangeClosed(1, n).filter(x -> x%2==1).forEach(i -> System.out.println(i));
		}

		public void sum_list(List<Integer> l) {
			int res= l.stream().mapToInt(Integer::intValue).sum();
			System.out.println(res);
			
			//.forEach(x -> System.out.println(x));
		}
	}
}