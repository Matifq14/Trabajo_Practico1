package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner notas = new Scanner(System.in);
		
		int num1 = 8;
		int num2 = 5;
		int num3 = 1;
		int num4 = 20;
		int num5 = 9;
		
		float promedio = (num1 + num2 + num3 + num4 + num5)/5f;
		
		System.out.println("El pomedio es: "+ promedio);

	}

}
