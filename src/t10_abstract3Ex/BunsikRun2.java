package t10_abstract3Ex;

public class BunsikRun2 {
	public static void main(String[] args) {
//		WangjaBunsik wangBunsik = new WangjaBunsik();
//		SeoulBunsik seoulBunsik = new SeoulBunsik();
//		WoojuBunsik woojuBunsik = new WoojuBunsik();

		// Up Casting
//		Bonsa wangBunsik = new WangjaBunsik();
//		Bonsa seoulBunsik = new SeoulBunsik();
//		Bonsa woojuBunsik = new WoojuBunsik();
//		
//		// 타입이 같으면 배열을 만들면 좋음
//		Bonsa[] bonsas = {wangBunsik, seoulBunsik, woojuBunsik};
		
		Bonsa[] bonsas = {new WangjaBunsik(), new SeoulBunsik(), new WoojuBunsik()};
		
		for(int i = 0; i<bonsas.length; i++) {
			bonsas[i].getShopName();
			bonsas[i].kimchi();
			bonsas[i].budae();
			bonsas[i].bibim();
			bonsas[i].sundae();
			bonsas[i].konggi();
			System.out.println("=====================================================");
			
		}
		
		/*
		wangBunsik.getShopName();
		wangBunsik.kimchi();
		wangBunsik.budae();
		wangBunsik.bibim();
		wangBunsik.sundae();
		wangBunsik.konggi();
		System.out.println("=====================================================");
		
		seoulBunsik.getShopName();
		seoulBunsik.kimchi();
		seoulBunsik.budae();
		seoulBunsik.bibim();
		seoulBunsik.sundae();
		seoulBunsik.konggi();
		System.out.println("=====================================================");
		
		woojuBunsik.getShopName();
		woojuBunsik.kimchi();
		woojuBunsik.budae();
		woojuBunsik.bibim();
		woojuBunsik.sundae();
		woojuBunsik.konggi();
		System.out.println("=====================================================");
		*/
	}
}
