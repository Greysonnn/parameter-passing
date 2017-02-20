/*
 * ParameterPassing.java
 * 
 * Copyright 2017 Greyson <greysonevers@Graytlien>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
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

