package interviewpackage;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String givenname = "THAMIZHSELVAN is fine";
		 //String[] name = givenname.split("");
		char[] name = givenname.toCharArray();
		System.out.println(name.length);
		 
		
		 for (int i = 0; i < name.length; i++) {
			 
			 if(name[i]>=65 && name[i]<=90) {
				name[i] = (char)(name[i]+32);
			 }
			
		}
		 for (int i = 0; i < name.length; i++) {
			 System.out.print(name[i]);
			
		}
		 
		 System.out.println(" ");
			
		 String myname = "MY name is THAMizh";
		 char[]mynamearray = myname.toCharArray();
		 
		 for(int i =0; i<mynamearray.length;i++) {
			 
			 if (mynamearray[i]>=97 && mynamearray[i]<=122 ) {
				 mynamearray[i]=(char)(mynamearray[i]-32);
				
			}
		 }
		 for(int i=0;i<mynamearray.length;i++) {
			 System.out.print(mynamearray[i]);
			 
		 }
         
	}

}


//Note:  if(name[i]>=65 && name[i]<=90)
//why we are giving this condition?
//reason for this question is 65 to 90 is the range for capital alphabets alone, why don't I keep like (69 to 122)
//b's if keep like above then it will convert the small alphabets as well by adding 32 to its ASCI value
//after addition 32, no ASCI value will match that value. So the letters wont be printed.
//so as per the given condition,***it will convert only capital alphabets to small and rest small alphabets
//will be as usual as small