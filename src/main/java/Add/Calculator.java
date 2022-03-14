package Add;

public class Calculator {
	   public static int add(int number1, int number2) {
	      return number1 + number2;
	   }
	 
	   public static int sub(int number1, int number2) {
	      return number1 - number2;
	   }
	 
	   public static int mul(int number1, int number2) {
	      return number1 * number2;
	   }
	 
	   // Integer divide. Return a truncated int.
	   public static int divInt(int number1, int number2) {
	      if (number2 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return number1 / number2;
	   }
	 
	   // Real number divide. Return a double.
	   public static double divReal(int number1, int number2) {
	      if (number2 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return (double) number1 / number2;
	   }
	
	// Adding Bugs 
	
	private static void buggy() throws IOException {
		    try(FileInputStream input = new FileInputStream("file.txt")) {
		        int data = input.read();
		        while(data != -1){
		            System.out.print((char) data);
		            data = input.read();
		        }
		    }
		}
	   
		public static void main(String[] args) {
			int caseIndex = 0;
	    	switch (caseIndex) {
	        	case 0:
	            	System.out.println("Zero");
	        	case 1:
	            	System.out.println("One");
	            	break;
	        	case 2:
	            	System.out.println("Two");
	            	break;
	        	default:
	            	System.out.println("Default");
	    	}
		}
	   
		 public void dosomething() {
				Integer number = null;
				
				if(number > 0)
				{
				   System.out.println("positive number");
				}
				
				}
		 public int divide (int numerator) {
				return numerator/0;
			}
				public int addone (int number) {
					return dosomethingprivate(number);
				}
				private int dosomethingprivate(int number) {
				
					return number++;
				}
	
	
	}
