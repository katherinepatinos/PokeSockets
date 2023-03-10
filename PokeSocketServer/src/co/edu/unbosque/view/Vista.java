package co.edu.unbosque.view;

import java.util.Scanner;

public class Vista {
	   private Scanner scanner;

	    public Vista() {
	        scanner = new Scanner(System.in);
	    }

	    public void imprimir(String message) {
	        System.out.println(message);
	    }

	    public int leerInt() {
	    	 return scanner.nextInt();
	    }

	    public String leerString() {
	    	
	        return scanner.next();
	    }
	}