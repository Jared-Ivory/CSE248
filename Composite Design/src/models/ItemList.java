package models;

import java.util.ArrayList;

public class ItemList {
	ArrayList<IItem> list;
	
	public ItemList() {
		list = new ArrayList<>();
	}
	
	public void add(IItem item) {
		list.add(item);
	}
	
	public void addAll(IItem...iItems) {
		for(IItem i: iItems) {
			list.add(i);
		}
	}
	
	public void printAllItems() {
		for(IItem i: list) {
			i.print();
		}
	}
}
