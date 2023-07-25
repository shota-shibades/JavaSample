package curriculum_B;

import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {

		// scannerを用意
		Scanner sc = new Scanner(System.in);
		// 取得した文字列を変数sentenceに格納
		String sentence = sc.nextLine();
		// 取得した文字列から"、"で区切って配列Productに格納
		String[] Product = sentence.split("、");
		// 拡張for文で配列Productから一つずつ引き出して繰り返し処理
		for (String product : Product) {
			// 在庫数を示す変数stockに0~11のランダムな数を生成
			int stock = (int) (Math.random() * 12);
			// switch文で引出された変数について条件分岐
			switch (product) {
			// 文字列が"パソコン"の場合の出力
			case "パソコン":
				System.out.println(product + "の残り台数は" + stock + "台です\n");
				break;
			// 文字列が"冷蔵庫"の場合の出力
			case "冷蔵庫":
				System.out.println(product + "の残り台数は" + stock + "台です\n");
				break;
			// 文字列が"扇風機"の場合の出力
			case "扇風機":
				System.out.println(product + "の残り台数は" + stock + "台です\n");
				break;
			// 文字列が"洗濯機"の場合の出力
			case "洗濯機":
				System.out.println(product + "の残り台数は" + stock + "台です\n");
				break;
			// 文字列が"加湿器"の場合の出力
			case "加湿器":
				System.out.println(product + "の残り台数は" + stock + "台です\n");
				break;
			// 文字列が"テレビ"または"ディスプレイ"の場合の出力
			case "テレビ":
			case "ディスプレイ":
				int max = 11;
				System.out.println(product);
				// 文字列の比較は"=="ではなくequalsメソッド
				System.out.println(product.equals("ディスプレイ") ? "ディスプレイの残り台数は" + (max - stock) + "台です\n"
						: "テレビの残り台数は" + stock + "台です\n");
				break;
			// 文字列が指定の商品以外の場合の出力
			default:
				System.out.println("『 " + product + "』は指定の商品ではありません\n");
				break;

			}
			// scannerを閉じる
			sc.close();
		}
	}
}
