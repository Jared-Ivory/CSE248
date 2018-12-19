package compositeDesign;

import models.ItemList;
import models.Ticket;
import models.Wine;

public class Demo {
	public static void main(String[] args) {
		Ticket t1 = new Ticket("John", "Center", "12/3", 50.0);
		Wine w1 = new Wine("Pinot", 12, 49.99);
		
		ItemList list = new ItemList();
		
		list.addAll(t1, w1);
		list.printAllItems();
	}
}

/* Elements:
	Component
		-declares interface for objects in composition.
		-implements deafault behaviour for the interface common to all classes as appropriate.
		-declares an interface for accessing and managing its child components.
	Leaf
		-represents leaf objects in the composition.A leaf has no children.
		-defines behaviour for primitive objects in the composition.
		-Composite
		-defines behaviour for components having children.
		-stores child components.
		-implements child related operations in the component interface.
	Client
		-manipulates objects in the composition through the component interface.
 * 
 */