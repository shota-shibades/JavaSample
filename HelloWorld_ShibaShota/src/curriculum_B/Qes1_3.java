package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		/* 1.)ログイン時の入力チェックシステムを下記条件で作成してください	
		 *	・コンソールにユーザー名を入力できるようにしてください	
		 *	・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください	
		 *	・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください	
		 *	・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください	
		 */

		// 2.)ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください

		// ユーザ名を格納する変数を定義
		String userName = null;
		// ユーザー名が正常に入力されるまでループする条件なので変数checkでフラグ
		boolean check = false;
		// while文で繰り返し処理」
		while (check == false) {
			// Scanarクラスでコンソールから文字列を入力
			Scanner sc = new Scanner(System.in);
			// nextLineメソッドで入力した文字列を取得
			userName = sc.nextLine();

			// 正規表現で10文字以上の文字列をチェック
			if (userName.length() > 10) {
				System.out.println("「名前を10文字以内にしてください」");

			// 正規表現で文字列の中の有無をチェック
			} else if (userName.length() == 0 || userName == null) {
				System.out.println("「名前を入力してください」");

				// matchesメソッドで半角英数字のチェック
			} else if (userName.matches("[^A-Za-z0-9]+")) {
				System.out.println("「半角英数字のみで名前を入力してください」");

				// 前記のバリデーション を抜ければフラグの変数checkがtrueになり、while文の条件を満たしてループから抜ける
			} else {
				System.out.println(userName + "「 入力したユーザー名 」を登録しました」\n");
				check = true;
			}
		}
		// ジャンケンのコード
		// ジャンケンの手を用意
		String[] Hand = { "グー", "チョキ", "パー" };
		// ジャンケンの回数を数える変数
		int count = 0;
		// ユーザの手を取得する変数
		Scanner Sc;
		// while文で使う変数を初期化。配列の引数として0,1,2は使っているので存在しない3を初期値
		int myHand = 3;
		int enemyHand = 3;

		
		// ジャンケンに勝利するまで繰り返す条件のwhile文
		while (!(myHand == 0 && enemyHand == 1 || myHand == 1 && enemyHand == 2
				|| myHand == 2 && enemyHand == 0)) {

			System.out.println("ジャンケンをします、数字を入力してください。\n0はグー、1：チョキ、2：パー");

			// Scanarクラスでコンソールから数を入力
			Sc = new Scanner(System.in);
			// nextntメソッドで入力した数をint型で取得
			myHand = Sc.nextInt();
			
			// ジャンケンの入力に誤りがある場合、再度入力に戻る
			if (!(myHand ==  0 || myHand == 1 || myHand == 2)) {
				System.out.println(myHand);
				continue;
			}
			
			// 自分の手と相手の手を出力
			System.out.println(userName + "の手は「" + Hand[myHand] + "」");
			// randomメソッドで配列Handの要素数の範囲で乱数を生成
			enemyHand = (int) (Math.random() * (Hand.length));
			System.out.println("相手の手は「" + Hand[enemyHand] + "」");
			// ジャンケンの回数をプラス1
			count++;
			
			// 自分がじゃんけんでグーに負けた場合
			if (myHand == 1 && enemyHand == 0 ) {
				System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！");
			}
			// 自分がじゃんけんでチョキに負けた場合
			if (myHand == 2 && enemyHand == 1 ) {
				System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
			}
			// 自分がじゃんけんでパーに負けた場合
			if (myHand == 0 && enemyHand == 2 ) {
				System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
			}
			// あいこの場合
			if (myHand ==  enemyHand) {
				System.out.println("DRAW あいこ もう一回しましょう！");
			}

		}
		System.out.println("やるやん。\n次は俺にリベンジさせて");
		System.out.println("勝つまでにかかった合計回数は"+ count +"回です");
	}
}


