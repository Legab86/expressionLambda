package org.demo.lambda;

import java.util.Arrays;
import java.util.Comparator;

import org.demo.lambda.interfaced.Interface1;

public class Classe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		partie1 & partie2

		Interface1 obj1 = () -> System.out.println("Implémentation de la fonction1()");
		obj1.function1();
		
		System.out.println("--------------------------------------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
//		exemple2
		
		String[] collection1 = {"Banane", "Orange", "Pomme", "Fraise", "Ananas"};
		
		Arrays.sort(collection1, new Comparator<String>() {
			public int compare(String o1, String o2) {return o1.length() -o2.length();};
		});
		
		for(String obj : collection1) {
			System.out.println(obj);
		}
		
		System.out.println("--------------------------------------------------------------");
		
		Arrays.sort(collection1, (o1, o2) -> {return o1.length() -o2.length();});
		
		for(String obj : collection1) {
			System.out.println(obj);
			
		}
	}

}
