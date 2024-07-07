package interviewpackage;

public class PrintEandOstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String given = "confused";
        String[] givenarray = given.split("");
        
        for(int i=0;i<givenarray.length;i++) {
        	
        	if(i%2!=0) {//if i keep i%2=0 then even numbers
        		givenarray[i]="*";
        		//System.out.println(given.charAt(i));
        		
        	}
        	
        }
        for(String name:givenarray) {
        	System.out.print(name);
        }
        //System.out.println(givenarray);
	}

}
