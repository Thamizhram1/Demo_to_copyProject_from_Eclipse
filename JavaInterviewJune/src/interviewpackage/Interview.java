package interviewpackage;


public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "my name is thamizhselvan ramamoorthy";
		String[] givenname =name.split(" ");
		String namewithout = name.replaceAll(" ", "");
		
		char findit = 'a';
		
		//String resultant="";

		for(int i=0; i<givenname.length;i++){

		System.out.println(givenname[i].substring(0, 1).toUpperCase()+givenname[i].substring(1,givenname[i].length()));
		
		//substring(.uppercase()+givename[i].substring(1,givenname.length);

		}
		
		
		int duplicate=0;
		
		//int asci =(int)givenname[i];
		
		
		for(int j=0;j<namewithout.length();j++) {
			
		if(namewithout.charAt(j)==findit){

		duplicate++;

		}
		else {
			System.out.println("number of occurance not happened ");
		}
		}
		
		//System.out.println();
		//sysout(resultant string with 1st letter uppercase);

		System.out.println("number of occurance "+duplicate);
		}
	}


