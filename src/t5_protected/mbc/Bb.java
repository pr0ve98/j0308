package t5_protected.mbc;

import t5_protected.kbs.Aa;

public class Bb extends Aa {
	public int a2 = 10;
	protected int b2 = 20;
	int c2 = 30;
	private int d2 = 40;
	
	public void modA2() {
		System.out.println("이곳은 Bb클래스의 modA메소드입니다.");
	}
	protected void modB2() {
		System.out.println("이곳은 Bb클래스의 modB메소드입니다.");
	}
	void modC2() {
		System.out.println("이곳은 Bb클래스의 modC메소드입니다.");
	}
	private void modD2() {
		System.out.println("이곳은 Bb클래스의 modD메소드입니다.");
	}
	
	@Override
	public void test() {
		modC2();
		
		a = 100; // public
		b = 200; // protected (상속된 애들만)
//		c = 300; default 같은 패키지만
//		d = 400; private 같은 클래스만
		int d = getD(); // 부모와 전혀 관계가 없음
		System.out.println("d " + d);
	}
	
}
