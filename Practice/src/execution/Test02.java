// 実行用のパッケージ
package execution;

public class Test02{

	public static void main(String[] args) {

		// 処理パッケージで作成したクラスをインスタンス化
		process.Test01 test = new process.Test01();
		// setterメソッドで変数foodに寿司を代入
		test.setValiable("寿司");
		// 　出力メソッドで出力
		test.show();
	}

}
