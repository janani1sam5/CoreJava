package org.comparator.com;

import java.util.Comparator;

public class SortedByName implements Comparator<Client>{

	// Used for sorting in ascending order of name
    public int compare(Client a, Client b) {
    	return a.name.compareTo(b.name);
    }
}
