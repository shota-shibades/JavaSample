package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {

		// 九九の段に使う変数を初期化、縦の意味を持つ”vertical”
		int vertical = 0;
		// 九九の列に使う変数を初期化、横の意味を持つ”horizontal”
		int horizontal = 0;
		// for文で変数verticalが9になるまで1ずつ加算する条件を指定
		for (vertical = 1; vertical <= 9; vertical++) {
			// 段が終わると改行
			System.out.println();
			// for文の中にfor文を書いて列を作る
			for (horizontal = 1; horizontal <= 9; horizontal++) {
				// String.formatメソッドで変数を0埋めして全ての数を２桁で出力
				System.out.print(String.format("%02d", vertical) + " * " + String.format("%02d", horizontal) + " = "
						+ String.format("%02d", vertical * horizontal));
				// 課題の記載どおりにする為if文で列の数が８以下のときは”||”を出力する
				if (horizontal <= 8) {
					System.out.print(" || ");
				}
			}
		}

	}
}
