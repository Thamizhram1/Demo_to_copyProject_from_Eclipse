package interviewpackage;

public class Firstlettercap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = " i am the first   rank    holder  ";
		
		String given =s.replaceAll("\\s{2,}", " ").trim();
		
		System.out.println(given);
		
		String[] givenarray = given.split(" ");
		
		for (int i = 0; i < givenarray.length; i++) {
			
			System.out.print(givenarray[i].substring(0, 1).toUpperCase()+givenarray[i].substring(1, givenarray[i].length())+" ");
			
			//if(givenarray.charAt(i)>=97 && givenarray.charAt(i)<=122) {
			
			//System.out.print(givenarray.charAt(i));
			}
			
		}
//		s.replaceAll("  ", " ");
//		
//		System.out.println(s);
		
	    //String[] s1 = s.split(" ");
	    
	    
//	    
//	    System.out.println(s1.length);
//	    
//	   for (int i = 0; i < s1.length; i++) {
//		   
//		   System.out.print(s1[i]);
//		
//	}

	}


