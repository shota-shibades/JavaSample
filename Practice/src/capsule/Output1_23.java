package capsule;

public class Output1_23 {
	public static void main(String[] args) {
		// 処理用のクラスをインスタンス化
		Qes1_23 capsule = new Qes1_23();

		// setterメソッドでそれぞれの変数を定義
		capsule.setNameLengthSpeed("ライオン", 2.1, 80);
		// getterメソッドで変数を取得し出力
		System.out.println("  動物名:" + capsule.getName());
		System.out.println("体長:" + capsule.getLength() + "m");
		System.out.println("速度:" + capsule.getSpeed() + "km/h");

	}
}
