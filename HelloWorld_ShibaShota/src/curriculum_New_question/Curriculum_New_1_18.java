package curriculum_New_question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void Q1() {
		// 文字列型の変数に"Hello JavaSE"を代入
		String text = "Hello JavaSE ";
		// int型の変数に"11"を代入
		int number = 11;
		// 引数に上記の2つの変数を渡してメソッドgreeting実行
		greeting(text, number);
	}

	// string型の変数と、int型の変数を使うメソッドを定義
	private static void greeting(String sentense, int figure) {
		// 引数として受け取った変数を合成して出力
		System.out.println(sentense + figure);
	}


	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void Q2() {
		// scannerクラスを用意
		Scanner sc = new Scanner(System.in);
		// int型の数値を受け取り、それぞれの変数number1、number2に代入
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		// 引数に上記の2つの変数を渡してメソッドcalcuation実行
		calcuation(number1, number2);
	}
	// int型の変数を2つ使うメソッドを定義
	private static void calcuation(int figure1, int figure2) {
		// 引数として受け取った変数を乗算して出力
		System.out.println(figure1 * figure2);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void Q3() {
		// scannerクラスを用意
		Scanner sc = new Scanner(System.in);
		// int型の数値を受け取り、それぞれの変数number1〜number4に代入
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		int number4 = sc.nextInt();
		// 上記の4つの変数を、配列arrayに格納
		int[] array = { number1, number2, number3, number4 };
		// 引数に配列arrayを渡してメソッドcalcQ3を実行
		calcQ3(array);
	}

	// 配列型の変数を受け取るメソッドを定義
	private static void calcQ3(int[] array) {
		// 配列の要素の数だけ繰り返すfor文
		for (int value : array) {
			// 配列の要素を順に出力
			System.out.println(value);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void Q4() {
		// scannerクラスを用意
		Scanner sc = new Scanner(System.in);
		// double型の数値を受け取り、それぞれの変数number1、number2に代入
		double number1 = sc.nextDouble();
		double number2 = sc.nextDouble();
		// 引数に上記の2つの変数を渡してメソッドcalcuation実行
		calcuation(number1, number2);
	}

	// double型の変数2つをQ2で使ったメソッドで使えうようにオーバーロード
	private static void calcuation(double figure1, double figure2) {
		// 引数として受け取った変数を乗算して出力
		System.out.println(figure1 + figure2);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	
	// List型の配列を受け取るメソッドを定義
	public static List <Integer> Q5() {
		// 繰り返し処理の判定に使うフラグを用意
		boolean flag = false;
		// scを格納のする為の変数を用意
		int number = 0;
		// 条件を満たすまで繰り返し処理
		while (flag == false) {
			// scannerクラスを用意
			Scanner sc = new Scanner(System.in);
			// scで数値を変数number
			number = sc.nextInt();
			// numberの中身が0以下なら繰り返しに戻る
			if (number <= 0) {
				continue;
			// numberの中身が0以上なら繰り返しを終了
			} else {;
				flag = true;
			}
		}
		// Listを用意
		List <Integer> array = new ArrayList<Integer>();
		// 入力された数回繰り返す条件
		for (int i = 0; i < number; i++) {
			// 0〜100のランダムな数字を生成し、変数valueに格納
			int value = (int) (Math.random() * 101 + 1);
			// 変数valueをコンソールに出力
			System.out.println(value);
			// 変数valueをListの配列arrayに格納
			array.add(value);
		}
		// 戻り値にarrayを返す
		return array;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	// 返り値にdouble型を受け取るメソッドを定義
	public static double Q6() {
		// listにQ5の返り値を格納
		List <Integer> array = Q5();
		// 合計値を求める変数totalを初期化
		double total = 0;
		// arrayの数だけ繰り返すfor文
		for(int value: array) {
			// 変数totalに配列の要素valueを加算
			total += value;
		}
		// 合計を配列の要素数で割って平均のavalageを計算
		double avalage = total/array.size();
		// avalageを出力
		System.out.println(avalage);
		// 戻り値にavalageを返す
		return avalage;
			}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	// 引数にdouble型の変数を渡すメソッドを定義
	public static void Q7(double argument) {
		// 判定を行う為、boolean型の変数judgementを宣言
		boolean judgement;
		// 変数judgementを定義
		judgement = argument >= 50;
		// 変数judgementを出力
		System.out.println(judgement);
	}
	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		Q1();
		Q2();
		Q3();
		Q4();
		Q5();
		Q6();
		Q7(Q6());

	}
}
