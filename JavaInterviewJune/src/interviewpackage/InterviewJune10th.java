package interviewpackage;

public class InterviewJune10th {

	public static void main(String[] args) {
		String name = "my name is thamizhselvan ramamoorthy";
		String[] givenname =name.split(" ");
		String namewithout = name.replaceAll(" ", "");
		
		char findit = 'a';

		for(int i=0; i<=givenname[0].length();i++){
			for(int i1=givenname[i].length()-1;i1<givenname[0].length();) {
        //int i1=0;
		//System.out.print(givenname[0].substring(0, 1).toUpperCase()+givenname[i].substring(1,givenname[i].length())+" ");
         System.out.println(givenname[i1].substring(i1).toUpperCase());
         break;
			}
  
		}
		System.out.println(" ");
		int duplicate=0;
		
		for(int j=0;j<namewithout.length();j++) {
			
		if(namewithout.charAt(j)==findit){

		duplicate++;

		}
		else {
			System.out.print("");
		}
		}

		System.out.println("number of occurance "+duplicate);
		}
	
	}


