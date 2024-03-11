package t10_abstract3Ex;

public class BunsikRun {
	public static void main(String[] args) {
		WangjaBunsik wangBunsik = new WangjaBunsik();
		wangBunsik.getShopName();
		wangBunsik.kimchi();
		wangBunsik.budae();
		wangBunsik.bibim();
		wangBunsik.sundae();
		wangBunsik.konggi();
		System.out.println("=====================================================");
		
		SeoulBunsik seoulBunsik = new SeoulBunsik();
		seoulBunsik.getShopName();
		seoulBunsik.kimchi();
		seoulBunsik.budae();
		seoulBunsik.bibim();
		seoulBunsik.sundae();
		seoulBunsik.konggi();
		System.out.println("=====================================================");
		
		WoojuBunsik woojuBunsik = new WoojuBunsik();
		woojuBunsik.getShopName();
		woojuBunsik.kimchi();
		woojuBunsik.budae();
		woojuBunsik.bibim();
		woojuBunsik.sundae();
		woojuBunsik.konggi();
		System.out.println("=====================================================");
		
	}
}
