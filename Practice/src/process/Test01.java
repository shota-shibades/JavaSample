// 処理用のパッケージ
package process;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
	private String food;


	// 出力するコンストラクタを定義
	public void show() {
		// 日付フォーマットをインスタンス化
		Date exDate = new Date();
		// 日付フォーマットを使って表示形式を指定
		SimpleDateFormat exDateFormat = new SimpleDateFormat("yyyy/MM/dd H:m:s");
		// コンソールに出力
		System.out.println("こんにちは！ここは日本です！");
		// フィールドで定義した変数foodを指定して出力
		System.out.println("この " + this.food + "はうまい");
		System.out.println(this.food + "は和食です");
		// exDateFormatで指定した形式で出力
		System.out.println("今の現在日時は" + exDateFormat.format(exDate) + "です");
	}
	
	// セッターメソッドで変数を定義
	public void setValiable(String food) {
		this.food = food;
		// nullチェック(foodの中身がnullの場合"null"と出力)
		if ( food == null ) {
		    System.out.println("str == null");
		}

	}
	
}
