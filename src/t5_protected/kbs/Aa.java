package t5_protected.kbs;

public class Aa {
	public int a = 10;
	protected int b = 20;
//	int b = 20;
	int c = 30;
	private int d = 40;
	
	public void modA() {
		System.out.println("이곳은 Aa클래스의 modA메소드입니다.");
	}
	protected void modB() {
		System.out.println("이곳은 Aa클래스의 modB메소드입니다.");
	}
	void modC() {
		System.out.println("이곳은 Aa클래스의 modC메소드입니다.");
	}
	private void modD() {
		System.out.println("이곳은 Aa클래스의 modD메소드입니다.");
	}
	
	public void test() {
		modD();
	}
	
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	
	
}
