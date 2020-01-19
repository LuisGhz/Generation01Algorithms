package com.practica1algoritmos.app;

import java.util.Arrays;

//import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		int contador = 1;
		String texto = "";
		String contenedorArray = "";
		
		for (int i = 0; i < arr.length; i++) {
			for (int x = 0; x < arr.length; x++) {
				arr[i][x] = contador;
				
				contador++;
			}
		}
		
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.deepToString(arr));
		System.out.println(contenedorArray);
	}

}
