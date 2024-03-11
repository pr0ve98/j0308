package t11_Interpace2;

public class RemoteRun {
	public static void main(String[] args) {
		Audio audio = new Audio();
		Tv tv = new Tv();
		
		audio.switchOn();
		audio.remoteName("audio");
		audio.switchOff();
		System.out.println();
		
		tv.switchOn();
		tv.remoteName("tv");
		tv.switchOff();
		
	}
}
