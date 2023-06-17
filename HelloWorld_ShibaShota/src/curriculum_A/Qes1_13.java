package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {

		/* 1.)下記9個をローカル変数として宣言のみしてください
		 *・バイト型・短整数型・整数型・長整数型
		 *・単精度浮動小数点数型・倍精度浮動小数点数型
		 *・文字型・文字列型
		 *・ブーリアン型
		 */

		// バイト型
		byte byteSample;
		// 短整数型
		short shortSample;
		// 整数型
		int intSample;
		// 長整数型
		long longSample;
		// 単精度浮動小数点数型
		float floatSample;
		// 倍精度浮動小数点数型
		double doubleSample;
		// 文字型
		char charSample;
		// 文字列型
		String strigSample;
		// ブーリアン型
		boolean booleanSample;

		// 2.)それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		byteSample = 0;
		shortSample = 0;
		intSample = 0;
		longSample = 0L;
		floatSample = 0F;
		doubleSample = 0d;
		charSample = '\0';
		strigSample = null;
		booleanSample = false;

		// 3.)初期化をしたそれぞれの変数に下記の値を代入してください
		byteSample = 10;
		shortSample = 100;
		intSample = 1000;
		longSample = 10000;
		floatSample = 9.5F;
		doubleSample = 10.5;
		charSample = 'a';
		strigSample = "ハロー";
		booleanSample = true;

		/* 4.)下記の通りにコンソール出力されるようにしてください
		 *上記で作成した変数を必ず使用すること
		 */
		System.out.println(byteSample + shortSample + intSample + longSample);

		System.out.println(byteSample * 2);

		System.out.println(charSample + " " + strigSample + " " + booleanSample);

		int total = (int) (byteSample + shortSample + intSample + longSample + floatSample + doubleSample);
		System.out.println(total);

		System.out.println(byteSample * shortSample * intSample * longSample);

		System.out.println(doubleSample / shortSample);

		System.out.println(byteSample - shortSample);

		// .5)プログラムを修正して、意図する処理に直す
		String num = "20";
		int num1 = 23;
		/* System.out.println("ハローJAVA"+(num+num1));の記述だと"20+23=43"
		 * の計算が行われてしまうので、下記のように文字列の結合とすることで"2023"と出力できる
		 */
		System.out.println("ハローJAVA" + num + num1);

		/* .6)『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		 * ローカル変数に代入し○○に入れてください
		 * 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		 */

		//変数を定義
		//名前
		String name = "山田太郎";
		//年齢
		int age = 18;
		//身長
		double height = 170.5;
		//体重
		double weight = 62.2;
		//食べ物
		String favorite = "寿司";
		//出力
		System.out.printf("「初めまして%sです」%n", name);
		System.out.printf("「年齢は%d歳です」%n", age);
		System.out.printf("「身長は%.1fcmです」%n", height);
		System.out.printf("「体重は%.1fkgです」%n", weight);
		System.out.printf("「好きな食べ物は%sです」%n", favorite);

		// .7)BMIを出力
		// 身長の単位を'm'に直す
		double heightBmi = height * 0.01;
		// BMIの計算はBMI＝体重(kg) ÷ [身長(m) Ｘ 身長(m)
		double bmi = weight / (heightBmi * heightBmi);
		System.out.printf("「BMIは%fです」", bmi);

		// .8).6で宣言した変数に再代入し下記の通りコンソールに出力してください
		// 再代入
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		favorite = "オムレツ";
		heightBmi = height * 0.01;
		bmi = weight / (heightBmi * heightBmi);

		// 出力
		System.out.printf("初めまして%sです%n", name);
		System.out.printf("年齢は%d歳です%n", age);
		System.out.printf("身長は%.1fcmです%n", height);
		System.out.printf("体重は%.1fkgです%n", weight);
		System.out.printf("好きな食べ物は%sです%n", favorite);
		System.out.printf("BMIは%.1fです", bmi);

		// .9).8で使用した変数を和算で自己代入し出力

		age += age;
		height += height;
		weight += weight;
		favorite += favorite;
		heightBmi = height * 0.01;
		bmi = weight / (heightBmi * heightBmi);

		System.out.printf("初めまして%sです%n", name);
		System.out.printf("年齢は%d歳です%n", age);
		System.out.printf("身長は%.1fcmです%n", height);
		System.out.printf("体重は%.1fkgです%n", weight);
		System.out.printf("好きな食べ物は%sです%n", favorite);
		System.out.printf("BMIは%.2fです%n", bmi);

		// .10) 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		System.out.println(height >= 25);

		// .11) 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		String ageString = String.valueOf(age);
		String heightString = String.valueOf(height);
		String weightString = String.valueOf(weight);
		//StringBuilderで文字列を連結
		StringBuilder Suzuki = new StringBuilder();
		Suzuki.append(ageString);
		Suzuki.append(heightString);
		Suzuki.append(weightString);
		System.out.println(Suzuki.toString());

		// .12)11で変換した【年齢・身長】を整数型に変換して出力してください
		//parseIntメソッドでString型からint型(整数型)に変換
		int ageInt = Integer.parseInt(ageString);
		//337.0は小数点があるので、parseDoubleメソッドを使ってそのままint型にキャスト
		int heightInt = (int) Double.parseDouble(heightString);
		//出力
		System.out.println(ageInt);
		System.out.println(heightInt);

		// .13)12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		//どちらか一つの条件に当てはまる場合なので論理和"||"
		System.out.println(ageInt > 25 || heightInt > 160);

	}

}
