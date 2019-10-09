/*
 * ParameterPassing.java
 * 
 * passing parameters, intro to programming lab
 */


public class Parameters {
	
	public static void method1 (int num1, int num2) {
		
		System.out.prinln(num1 - num2);
		
	}
	
	public static void method2 (double d1, double d2) {
	
		System.out.println((d1+d2+d3)/3);
	
	}
	
	public static void method3 (String fname, Stringlname) {
	
		System.out.println(fname + " " + lname);
	
	}
	
	public static void main(String[]args) {
											// int num1=2; int num2=3;
		method1(2,3);
											// d1=3.5; d2=5.0; d3=4.7;
		method2(3.5,5.0,4.7);
											//fname="Greyson"; lname="Evers";
		method3("Greyson", "Evers");
	}
}

