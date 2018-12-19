package p3;
import java.util.HashSet;
import java.util.Set;

public class School implements Observable{
	private String name;
	private String id;
	private Set<Observer> observers = new HashSet<>();
	
	public School(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	
	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer observer: observers) {
			observer.update();
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	

}
