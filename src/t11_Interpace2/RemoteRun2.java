package t11_Interpace2;

public class RemoteRun2 {
	public static void main(String[] args) {
//		Remote audio = new Audio();
//		Remote tv = new Tv();
		
		Remote[] remotes = {new Audio(), new Tv()};
		String[] titles = {"Audio", "TV"};
		
		for(int i=0; i<remotes.length; i++) {
			remotes[i].switchOn();
			remotes[i].remoteName(titles[i]);
			remotes[i].switchOff();
			System.out.println();
		}
		/*
		audio.switchOn();
		audio.remoteName("audio");
		audio.switchOff();
		System.out.println();
		
		tv.switchOn();
		tv.remoteName("tv");
		tv.switchOff();
		*/
		
		
		
	}
}
