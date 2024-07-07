package interviewpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class MapIteration_forcharocc {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "thamizhselvanramamoorthy";
		
		char givenname [] = name.toCharArray();
		
		LinkedHashMap<Character,Integer> obj = new LinkedHashMap<Character,Integer>();
		
		obj.put('T', 1);
		obj.put('P', 2);
		obj.put('c', 3);
		
		Map<Character,Integer> r = Map.of('T',1,'P',2,'C',3);
		System.out.println("Map of function"+r);
		System.out.println(obj.get('c'));
		
		for(Entry<Character,Integer> e:obj.entrySet()) {
			System.out.println(e.getKey()+"="+e.getValue());
			
		}
		
		Iterator<Entry<Character, Integer>> it =obj.entrySet().iterator();
		while(it.hasNext()){
		System.out.println("Inside Entryset"+it.next());	
			
		}
		Iterator<Character> tr =obj.keySet().iterator();
		
		while(tr.hasNext()) {
			System.out.println("Inside Keyset"+tr.next());
			
		}
		
		Iterator<Integer> tn=obj.values().iterator();
		while(tn.hasNext()) {
			System.out.println("Inside valueset"+tn.next());
			
		}
		
//		for(char c:givenname) {
//			
//			if(obj.containsKey(c)) {
//				obj.put(c,obj.get(c)+1);
//				
//			}
//			else {
//				obj.put(c, 1);
//				
//			}
//		}
//     System.out.println(obj);
	}

}
