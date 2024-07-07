package interviewpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class MapTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> obj = new HashMap<String,String>();
		
		obj.put("A", "Angular");
		obj.put("Se", "Selenium");
		obj.put("BDD", "Cucumber");
		
		for(Entry<String, String> e:obj.entrySet()) {
			
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		

	}

}
