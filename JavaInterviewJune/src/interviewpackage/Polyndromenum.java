package interviewpackage;

public class Polyndromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 16461;
		String given =Integer.toString(input);
		char[] givenarray = given.toCharArray();
		
		//for(int i =0;i<given.length();i++)
		//for(int i=given.legth()-1; i>=0;j--)
		String reversed ="";
		for (int j = givenarray.length-1; j>=0; j--) {
			
			reversed = reversed+givenarray[j];
			
		}
      System.out.println(reversed);
      
      if(given.equals(reversed)) {
    	  
    	  System.out.println("Given number is polyndrome number");
    	  
      }
      else {
    	  System.out.println("Given number is not polyndrome");
      }
	}

}
