package curriculum_New_question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void Q1() {
		String text = "Hello JavaSE ";
		int number = 11;
		greeting(text, number);
	}

	private static void greeting(String sentense, int figure) {
		System.out.println(sentense + figure);
	}


	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void Q2() {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		calcuation(number1, number2);
	}

	private static void calcuation(int figure1, int figure2) {
		System.out.println(figure1 * figure2);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void Q3() {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		int number4 = sc.nextInt();
		int[] array = { number1, number2, number3, number4 };
		calcQ3(array);
	}

	private static void calcQ3(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void Q4() {
		Scanner sc = new Scanner(System.in);
		double number1 = sc.nextDouble();
		double number2 = sc.nextDouble();
		calcuation(number1, number2);
	}

	private static void calcuation(double figure1, double figure2) {
		System.out.println(figure1 + figure2);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static List <Integer> Q5() {
		boolean flag = false;
		int number = 0;
		while (flag == false) {
			Scanner sc = new Scanner(System.in);
			number = sc.nextInt();
			if (number <= 0) {
				continue;
			} else {;
				flag = true;
			}
		}
		List <Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < number; i++) {
			int value = (int) (Math.random() * 101 + 1);
			System.out.println(value);
			array.add(value);
		}
		return array;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double Q6() {
		List <Integer> array = Q5();
		double total = 0;
		for(int value: array) {
			total += value;
		}
		double avalage = total/array.size();
		System.out.println(avalage);
		return avalage;
			}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void Q7(double argument) {
		boolean judgement;
		judgement = argument >= 50;
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
