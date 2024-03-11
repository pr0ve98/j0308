package t11_Interpace3;

public interface Remote {
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public abstract void switchOn(String name);
	void switchOff(String name);
	
	void remoteName(String name);
	void setVolume(int volume);
}
