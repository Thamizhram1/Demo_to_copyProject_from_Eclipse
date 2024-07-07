package com.interview;

import java.util.ArrayList;
import java.util.Collections;

public class Reverseaword_using_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"Nisum", "Naresh", "Automation Testing"};
		ArrayList<String> givenname = new ArrayList<String>();
		
		for(String s:name) {
		 givenname.add(s);
		}
		
		Collections.reverse(givenname);
		for(String n:givenname) {
			System.out.print(n+" ");

		}
		}
		
	}
