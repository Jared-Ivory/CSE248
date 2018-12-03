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
