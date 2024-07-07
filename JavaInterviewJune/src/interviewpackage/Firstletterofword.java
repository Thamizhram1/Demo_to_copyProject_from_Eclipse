package interviewpackage;

public class Firstletterofword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		if(givenarray[0]!="") {
//			//for(int i=0; i<givenarray[0].length();i++) {
//				
//				givenarray[0].toUpperCase();
//				
//			}
//			for(String result:givenarray) {
//				System.out.println(result);
//				
//			}
		
		String name = "my name is thamizhselvan ramamo";
		String[] givenarray = name.split(" ");
		System.out.println(name.charAt(0));
		System.out.println(name);
		System.out.println("Try "+ givenarray[0].substring(0,1).toUpperCase()+givenarray[0].substring(1));
		String aftermd = givenarray[0].substring(0,1).toUpperCase()+givenarray[0].substring(1);
		
		
		String resultant = aftermd+name.substring(2);
		
		char initialchar =name.charAt(0);
		  char convertedchar = Character.toUpperCase(initialchar);
		  	String result = convertedchar + name.substring(1);
		  	System.out.println(result);
		  	System.out.println("without using char "+resultant);
		}

	}

//note: this is correct program after multiple try
