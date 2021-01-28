package org.comparator.com;

import java.util.Comparator;

public class SortedById implements Comparator<Client>{

	//Used to sorting in Ascending order
	public int compare(Client a, Client b) {
		return a.id - b.id;
	}
	
	
}
