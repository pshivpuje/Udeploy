package SonarAndJacoco.SonarAndJacoco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


	public class TestShowMessage {  
	    
	    String message = "Prathamesh Shivpuje";
	    String message1= "Prathamesh";
	      boolean expected= true;
	      
	     
	    ShowMessage obj = new ShowMessage(message,message1);  
	    
	 /*
	    @Test(expected = ArithmeticException.class)  
	    public void testshow() {      
	        System.out.println("We are inside of the show() method");       
	        obj.show();       
	    }  */
	      
	    
	   public void testfinalMessage() {  
	        System.out.println("We are inside of the finalMessage() method");  
	        String msg = "Hello!" + "Prathamesh Shivpuje";  
	        assertEquals(msg,obj.finalMessage());  
	    }  
	    

		@Test 
	    public void testnewmessage() {  
	        System.out.println("We are inside of the NewMessage() method");  
	        String msg1 = "who is " + "prathamesh";  
	        assertequlas(msg1,obj.newmessage());
	        }

		private void assertequlas(String msg1, String newmessage) {
			// TODO Auto-generated method stub
			
		} 
	    
	}  

