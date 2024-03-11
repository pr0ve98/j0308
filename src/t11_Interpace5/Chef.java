package t11_Interpace5;

public class Chef implements Action {

	@Override
	public void catching() {}

	@Override
	public void search() {}

	@Override
	public void fire() {}

	@Override
	public void save() {}

	@Override
	public void pizza() {
		System.out.println("피자를 만듭니다.");
	}

	@Override
	public void spagetti() {
		System.out.println("스파게티를 만듭니다.");
	}
}
