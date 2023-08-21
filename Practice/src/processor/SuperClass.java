// 処理用パッケージ
package processor;

import java.util.Random;

// 親クラスとするので"SuperClassと命名"
public class SuperClass {
	//randomクラスを初期化
	Random rnd = new Random();

	// 引数に変数が渡されると0~999の数が返されるメソッドを定義
	public int num;
	public int power() {
		num = rnd.nextInt(1000);
		return num;
	}
}
