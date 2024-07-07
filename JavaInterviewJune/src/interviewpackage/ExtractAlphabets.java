package interviewpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class ExtractAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Naresh**><?nare@#$";
		//String[] givenname = name.split("");
		
		String namechange = name.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(namechange);
//		char[] givenname=name.toCharArray();
		
//		for(int i=0;i<givenname.length;i++) {
//			
//			if(Character.isAlphabetic(givenname[i])) {
//				System.out.print(givenname[i]);
//				
//			}
			
//		ArrayList<String> objarray = new ArrayList<String>();
//		for(String s:givenname) {
//			
//			objarray.add(s);
//			
//		}
//		
//       Collections.replaceAll(objarray, "*", "");
//       Collections.replaceAll(objarray, "<", "");
//       Collections.replaceAll(objarray, ">", "");
//       Collections.replaceAll(objarray, "@", "");
//       Collections.replaceAll(objarray, "#", "");
//       Collections.replaceAll(objarray, "$", "");
//       System.out.println(objarray);
//       
//       ListIterator<String> listobj = objarray.listIterator();
//       while(listobj.hasNext()){
//    	   System.out.print(listobj.next());
//    	   
//       }
	}
    
}