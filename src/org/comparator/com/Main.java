package org.comparator.com;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Client> ar = new ArrayList<Client>();
		ar.add(new Client(20, "Anu", "london"));
        ar.add(new Client(30, "Sam", "Chennai"));
        ar.add(new Client(40, "Banu", "jaipur"));
        
        System.out.println("UnSorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
        
        Collections.sort(ar,new SortedById());
        
        System.out.println("\nSorted by id: ");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));Collections.sort(ar, new SortedByName());
            
        System.out.println("\nSorted by name");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));    
        
        
	}
	
}
