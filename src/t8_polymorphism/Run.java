package t8_polymorphism;

public class Run {
	public static void main(String[] args) {
		Bb bb = new Bb();
		System.out.println();
		
		System.out.println("bb.su : "+bb.su);
		bb.modBb();
		bb.modAa();
		System.out.println();
		
		/* --------Up Casting---------- */
		
		Aa ba = new Bb(); // 생성자
		// 생성이 되어야 up casting을 쓸 수 있다
		// 생성자는 오버라이드를 못함
		// 생성이 되는지 확인하려고 sysout 써서 출력함 실 사용에는 "__ 기본 생성자입니다" 나오지 않아서 그냥 씀
		ba.modAa(); // Aa 만 나옴
		// Bb에서 modAa를 override 해서 출력 결과가 Bb 클래스의 modAa 메소드라고 나옴
		System.out.println();
		
		/* --------Down Casting---------- */
		// 부모로 Up Casting이 되어 있을 경우에만 자신으로 Down Casting 할 수 있다.
		Bb bab = (Bb)ba;
		bab.modAa(); // Bb 만 나옴
		System.out.println();
		
		/* ----------------------------- */
		Aa ca = new Cc();
		ca.modAa();
		ca.modCc();
		ca.modHh(50, 100);
	}
}
