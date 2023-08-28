package Qes28_29;

import java.util.Arrays;
import java.util.Scanner;

public class Execution {

	public static void main(String[] args) {
		// scannerクラスを用意
		Scanner sc = new Scanner(System.in);
		String number = "";
		// コンソールに入力を要求
		System.out.println("コンソールに0から10までの数字を入力してください。\n複数入力する場合は’,’で区切ること。");
		// コンソールの入力を変数に格納
		number = sc.nextLine();
		// 受け取った変数を","で区切って配列に格納
		String array[] = number.split(",");
		// int型の配列を作成
		int numbers[] = new int[array.length];
		// for文で配列arrayをint型に変換
		for (int i = 0; i<array.length; i++) {
			numbers[i]=Integer.parseInt(array[i]);
		}
		sc.close();
		// 配列を昇順に並べ替え
		Arrays.sort(numbers);
		// 処理用のクラスをインスタンス化
		Qes28_29_2.Processer pr = new Qes28_29_2.Processer();
		// for文で配列の数を順に代入して出力
		for (int i = 0; i<numbers.length; i++) {
			pr.printInfo(numbers[i]);
		}
			
	}

}
