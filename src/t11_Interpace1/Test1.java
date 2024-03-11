package t11_Interpace1;

public interface Test1 {
//	int max = 1000000; // public static final 알아서 들어간 것
	int MAX = 1000000; // 상수는 대문자
	public static final int MIN = 0;

	// 추상 메소드
	void data(); // public abstract 들어간 것
	void data1(int su);
	public abstract void data2();
	
	// default 메소드
	default void data3() { // 실행블록 있어야 함
		// 실행할 내용을 포함/생략
		System.out.println("이곳은 data3메소드(default)");
	}
	
	// static 메소드
	static void data4() { // 실행블록 있어야 함
		// 실행할 내용을 포함
		System.out.println("이곳은 data4메소드(static)");
	}
}
