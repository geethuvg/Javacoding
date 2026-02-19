package challenge;

// Singleton classes in Java
public class Singleton {
	
	private final Singleton instance = new Singleton();
	
	private Singleton() {
		
	}

	public Singleton getInstance() {
		return instance;
	}

}
