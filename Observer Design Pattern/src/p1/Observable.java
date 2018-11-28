 package p1;

/***
 * Multiple observers and a single observable 
 * @author ivorj32
 *
 */

public interface Observable {
	
	void register(Observer o);
	
	void unregister(Observer o);
	
	// Notifies observers of any change.
	void notifyObservers();
}
