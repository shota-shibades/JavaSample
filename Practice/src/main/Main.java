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
		// 親クラスで定義したメソでそれぞれの変数にランダムな数値をセッターで代入
		sc.setHitPoint(sc.power());
		sc.setMagicPoint(sc.power());
		sc.setAttack(sc.power());
		sc.setSpeed(sc.power());
		sc.setDefence(sc.power());
		// 出力
		System.out.printf("HP:%d%nMP:%d%n攻撃力%d%n素早さ:%d%n防御力:%d%n", sc.getHitPoint(), sc.getMagicPoint(), sc.getAttack(),
				sc.getSpeed(), sc.getDefence());
		System.out.println("さあ冒険に出かけよう");

	}

}

/*
~問題文~
下記がコンソールに出力されるように作成してください

	こんにちは！ここは日本です！
	この寿司はうまい
	寿司は和食です
	今の現在日時は2023/03/09 10:23:39です

【条件】
	・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	・適切なファイルにフィールドで変数を必要な数作ってください。
	・thisを使って作成してください。
	・日時は今日の日付を取得してください。
	
*/