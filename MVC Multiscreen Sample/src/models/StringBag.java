package application;

public class StringBag {
	private String[] arr;
	private int nElems;
	
	
	public StringBag(int maxSize) {
		arr = new String[maxSize];
		nElems = 0;
	}
	
	//takes an amount of strings and creates a string bag with size of string array/
	public StringBag(String... str) {
		nElems = str.length;
		arr = new String[nElems];
		for(int i =0; i<nElems; i++) {
			arr[i]= str[i];
		}
	}
	
	//inserts a new string value into the array
	public void insert(String s) {
		arr[nElems++]= s;
	}
	
	//obviously pops top of stack
	public String pop() {
		return arr[--nElems];
	}
	
	//returns amount of elements within the array of strings
	public int getNElems() {
		return nElems;
	}
	
	public String toString(){
		return arr.toString();
	}
}
