package t10_abstract2;

public class Run {
	public static void main(String[] args) {
		// Animal animal = new Animal(); // Animal 은 추상클래스여서 생성해서 사용 X
		
		Animal aniDog = new Dog();
		aniDog.cry();
		Animal aniCat = new Cat();
		aniCat.cry();
		
	}
}
