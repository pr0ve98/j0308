package t11_Interpace2;

public class AudioRun {
	public static void main(String[] args) {
		
		// 추상클래스, 인터페이스는 생성 불가
		Audio audio = new Audio();
		
		System.out.println("Audio 최대 볼륨 : "+audio.MAX_VOLUME);
		System.out.println("Audio 최소 볼륨 : "+audio.MIN_VOLUME);
		System.out.println();
		
		audio.switchOn();
		audio.remoteName("Audio");
		audio.switchOff();
	}
}
