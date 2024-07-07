package com.interview;

public class Reverseaword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "apple apple orange";
		String[]givenname = name.split(" ");
		
//		for(String s:givenname) {
//			System.out.print(s);
//		}
//		
		
//		for(int i=givenname.length-1;i>=0;i--) {
//			
//			System.out.print(givenname[i]);
//		}

		
		for(int i=0;i<givenname.length;i++) {
			for(int j=givenname[i].length()-1;j>=0;j--) {
				System.out.print(givenname[i].charAt(j));

			}
			System.out.print(" ");
		}
	}

}

//note: egnaro,elppa,elppa 1st code
//