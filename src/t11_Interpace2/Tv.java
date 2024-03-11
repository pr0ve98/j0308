package t11_Interpace2;

public class Tv implements Remote {

	@Override
	public void switchOn() {
		System.out.println("TV 전원을 켭니다.");
	}

	@Override
	public void switchOff() {
		System.out.println("TV 전원을 끕니다.");

	}

	@Override
	public void remoteName(String name) {
		System.out.println(name + " 리모콘");
	}

}
