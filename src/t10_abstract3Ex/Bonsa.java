package t10_abstract3Ex;

@SuppressWarnings("unused")
public abstract class Bonsa {
	public String shopName;
	public int kimchi;
	public int budae;
	public int bibim;
	public int sundae;
	public int konggi;
	
	public Bonsa(String shopName, int kimchi, int budae, int bibim, int sundae, int konggi) {
		this.shopName = shopName;
		this.kimchi = kimchi;
		this.budae = budae;
		this.bibim = bibim;
		this.sundae = sundae;
		this.konggi = konggi;
	}
	public abstract void kimchi();
	public abstract void budae();
	public abstract void bibim();
	public abstract void sundae();
	public abstract void konggi();
	
	public void getShopName() {
		System.out.println("점포명 : " + shopName);
	}
}
