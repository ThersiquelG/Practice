
public class Calculator {
	 /*public Calculator() {
	} */

	  
		public int add (int a, int b) {
			int sum = a + b;
			return sum  ;
			
		}
		
		public int subtract (int a, int b) {
			int difference = a - b ;
			return difference ;
		}
		
		public int multiply (int a, int b) {
			int product = a * b;
			return product ;
		}
		
		public int divide (int a, int b) {
			if(b == 0) {
				System.out.println("Error! Dividing by zero is not allowed.");
			} else{
				return a / b;
				
			}
			
			return 0;
	}
		public int modulo (int a, int b) {
			if (b == 0) {
				System.out.println("Error! Dividing by zero is not allowed.");
			} else {
				return a % b;
			}
			return 0;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 Calculator myCalculator = new Calculator();
		
		 System.out.println(myCalculator.add(5, 7));
		 
		 System.out.println(myCalculator.subtract(45, 11));
		 
		 
	}

}
