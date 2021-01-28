package org.exception.com;

import java.util.Hashtable;
import java.util.Map;

//Null Pointer Exception
public class TaskNullException {

		
		public static void main(String[] args) {
			
			Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
			// Hash Table do not allow null in Both Key and Values
			ht.put(20,null);
			ht.put(30, "Jana");
			ht.put(40, "Ravi");
			ht.put(50, "Kavi");
			
			for(Map.Entry<Integer, String> m:ht.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());
				
			}
			
		}
}
