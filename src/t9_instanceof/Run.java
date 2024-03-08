package t9_instanceof;

public class Run {
	public static void main(String[] args) {
		
		//Aa aa = new Aa();
		Aa aa = new Bb(); // Up Casting
		
		// aa 객체가 과거에 Aa타입으로 업캐스팅 했었는지 알아보고 처리해야함
		if( aa /*객체명*/ instanceof Bb /*타입명*/ ) { // Up Casting 확인법 instanceof
			// 강제 down casting 을 하려면 Up Casting 거쳐야 함
			Bb bb = (Bb)aa;
			System.out.println("Down Casting 성공!");
		}
		else {
			System.out.println("Down Casting 불가...");
		}
	}
}
