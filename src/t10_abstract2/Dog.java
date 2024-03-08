package t10_abstract2;

public class Dog extends Animal {
	public String talk = "멍멍";

	@Override
	public void cry() {
		System.out.println("강아지 울음소리: "+talk);
	}
	
	
}
