package capsule;

public class Qes1_23 {
	//  カプセル化-処理用のクラスからのみ変数の定義が行えるようアクセス修飾子privateを指定
	// 動物名の変数nameを定義
	private String name;
	// 体長の変数lengthを定義
	private double length;
	// 速さの変数speedを定義
	private int speed;
	
	
	//コンストラクタで引数を変数に代入
	public Qes1_23(String name, double length, int speed) {
		super();
		this.name = name;
		this.length = length;
		this.speed = speed;
	}

	// getterメソッド
	// 変数nameを取得
	public String getName() {
		return this.name;
	}

	// 変数lengthを取得
	public double getLength() {
		return this.length;
	}

	// 変数speedを取得
	public int getSpeed() {
		return this.speed;
	}
	
}


