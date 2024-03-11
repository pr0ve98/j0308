package t11_Interpace4;

public class Bear implements Toy {
	private int age = 0;

	@Override
	public void age() {
		System.out.println("모든 연령대가 다 사용하실 수 있습니다.");
	}

	@Override
	public void moving() {
		System.out.println("팔다리를 움직일 수 있습니다.");
	}

	@Override
	public void fire() {}

	@Override
	public void misaile() {}

	@Override
	public int possibleAge() {
		return age;
	}

}
