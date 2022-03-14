package Add;

public class MyNumber {
	   int number;
	 
	   // Constructor
	   public MyNumber() {
	      this.number = 0;
	   }

	   public MyNumber(int number) {
	      this.number = number;
	   }
	 
	   // Getter and setter
	   public int getNumber() {
	      return number;
	   }
	 
	   public void setNumber(int number) {
	      this.number = number;
	   }
	 
	   // Public methods
	   public MyNumber add(MyNumber rhs) {
	      this.number += rhs.number;
	      return this;
	   }
	 
	   public MyNumber div(MyNumber rhs) {
	      if (rhs.number == 0) throw new IllegalArgumentException("Cannot divide by 0!");
	      this.number /= rhs.number;
	      return this;
	   }
	
	// Bugs 
	
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
	
