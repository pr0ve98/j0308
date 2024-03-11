package t11_Interpace2;

public interface Remote {
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public abstract void switchOn();
	void switchOff();
	
	void remoteName(String name);
}
