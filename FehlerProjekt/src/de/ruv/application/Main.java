package de.ruv.application;

public class Main {

	public static void main(String[] args) {
		try {
			
			int a, b , c;
			
			a = b = 0;
			
			c =  a / b; 
			
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		System.out.println("Vielen Dank Sie haben ein kleines Programm echt gluecklich gemacht");
	}
	
	static int foo() {
		try {
			
			int a, b , c;
			
			a = b = 0;
			
			return  a / b; 
			
		} catch (Exception e) {
			return 0;
		} finally {
			System.out.println("Vielen Dank Sie haben ein kleines UnterProgramm echt gluecklich gemacht");
		}
		
		//System.out.println("Vielen Dank Sie haben ein kleines UnterProgramm echt gluecklich gemacht");
	}
	
	

}
