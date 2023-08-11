package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		System.out.println(new Dog().animal);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		//乱数を作成
		Random rnd = new Random();
		int value = rnd.nextInt(10);
		//変数valueを引数に渡してDogクラスを呼び出す
		System.out.println(new Dog(value).count);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// 現在の日時を取得
		Date exDate = new Date();
		// 表示形式を指定
		SimpleDateFormat exDateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:S");
		// 出力
		System.out.println(exDateFormat.format(exDate));
	}
}
