package com.interview;

import java.util.HashMap;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    String name = "thamizhselvanramamoorthy";
  
       String removed = name.replaceAll("[aeiou]","");
       
       System.out.println("once vowels removed"+removed);
       
        char givenname[]=removed.toCharArray();
        
        HashMap<Character,Integer>obj=new HashMap<Character,Integer>();
        
        for(Character c:givenname){
            
            if(obj.containsKey(c)){
                obj.put(c,obj.get(c)+1);
            }
            else{
                obj.put(c,1);
            }
            
        }
        System.out.println(obj);
		
	}

}
///Except vowels, I need every characters accurance