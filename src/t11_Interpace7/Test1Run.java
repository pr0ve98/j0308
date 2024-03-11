package t11_Interpace7;

interface Aa {
	int AA = 10;
	void abc();
}

class Bb implements Aa {
	@Override
	public void abc() {
		System.out.println("Bb클래스의 abc()메소드입니다.");
	}
}

class Cc implements Aa {
	@Override
	public void abc() {
		System.out.println("Cc클래스의 abc()메소드입니다.");
	}
}

public class Test1Run { // public은 파일명이랑 같은 클래스에만 붙일 수 있다(다른 클래스는 생략함)
	public static void main(String[] args) {
//		Bb b1 = new Bb();
//		Bb b2 = new Bb();
//		Cc c1 = new Cc();
//		Cc c2 = new Cc();
		
		// 구현객체 생성
		Aa b1 = new Bb();
		Aa b2 = new Bb();
		Aa c1 = new Cc();
		Aa c2 = new Cc();
		
		// 구현객체 안의 메소드 호출
		b1.abc();
		b2.abc();
		c1.abc();
		c2.abc();
	}
}
