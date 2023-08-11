package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		System.out.println(new Dog().animal);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Random rnd = new Random();
		int value = rnd.nextInt(10);
		System.out.println(new Dog(value).count);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Date exDate = new Date();   // 2．日付（今回は現在の日時）を取得
		SimpleDateFormat exDateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:S"); // 3．パターンを指定
		System.out.println(exDateFormat.format(exDate));
	}
}
