package t8_polymorphism;

public class Cc extends Aa {
	public int su = 30;

	public Cc() {
		System.out.println("이곳은 Cc 기본 생성자입니다.");
	}
	
	@Override
	public void modCc() {
		System.out.println("이곳은 Cc클래스의 modCc 메소드입니다.");
	}

	@Override
	public void modHh(int a, int b) {
		System.out.println("두 수의 합: "+(a+b));
	}
	
	
}
