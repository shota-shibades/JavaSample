// 実行用パッケージ
package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// scannerクラスを用意
		Scanner scan = new Scanner(System.in);
		// 名前入力を求める出力
		System.out.println("名前を入力してください");
		// scannerクラスでコンソールから名前を取得
		String name = scan.next();
		// scannerを閉じる
		scan.close();
		// 課題の文言の通り出力
		System.out.println("こんにちは 「 " + name + " 」 さん");
		System.out.println("ステータス");
		// 処理用パッケージの子クラスをインスタンス化
		processor.SubClass sc = new processor.SubClass();
		// 子クラスで定義したメソッドでそれぞれの数値に代入
		sc.set();
		// 出力
		System.out.printf("HP:%d\nMP:%d\n攻撃力%d\n素早さ:%d\n防御力:%d\n", sc.getHitPoint(), sc.getMagicPoint(), sc.getAttack(),
				sc.getSpeed(), sc.getDefence());
		System.out.println("さあ冒険に出かけよう");

	}

}
