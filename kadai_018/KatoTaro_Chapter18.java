package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

	public KatoTaro_Chapter18() {
		this.familyName = "加藤";
		setGivenName();
		this.address="東京都中野区○×";
	}
	
	public void setGivenName() {
		this.givenName = "太郎";
	}
	
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
}
