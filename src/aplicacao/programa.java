package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.triangulo;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        triangulo x , y;
        x = new triangulo();
        y = new triangulo();
		
	    System.out.println("Entre com o valor do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com o valor do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c= sc.nextDouble();
		
		
		double areaX = x.area();
	   double  areaY = y.area();
	    
		
		System.out.printf("valor do triângulo X: %.4f%n" , areaX);
	 
		System.out.printf("valor do triângulo Y: %.4f%n" , areaY);
		
						
        if (areaX > areaY) {
        	
System.out.printf("triângulo maior:  X");

       }else
    	   
System.out.printf("triângulo maior:  Y");

sc.close();
}

	}


