package t11_Interpace2;

public class TvRun {
	public static void main(String[] args) {
		
		// 추상클래스, 인터페이스는 생성 불가
		Tv tv = new Tv();
		
		System.out.println("TV 최대 볼륨 : "+tv.MAX_VOLUME);
		System.out.println("TV 최소 볼륨 : "+tv.MIN_VOLUME);
		System.out.println();
		
		tv.switchOn();
		tv.remoteName("TV");
		tv.switchOff();
	}
}
