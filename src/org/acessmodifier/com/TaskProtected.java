package org.acessmodifier.com;

//Access Modifier : Protected
//Main class
public class TaskProtected extends Data{

	 public static void main(String[] args) {

		     // We can access Protected Method from same Package and different class
	        // create an object of TaskProtected
	        TaskProtected tp = new TaskProtected();
	         // access protected method
	        tp.display();
	    }
}
