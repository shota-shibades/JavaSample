package Qes26_28;

import java.util.Scanner;

public class Execution {

	public static void main(String[] args) {
		// scannerクラスを用意
		Scanner sc = new Scanner(System.in);
		String order = "";
		// コンソールに入力を要求
		System.out.println("コンソールに文字を入力してください");
		// コンソールの入力を変数に格納
		order = sc.nextLine();
		sc.close();
		// 受け取った変数を","で区切って配列に格納
		String orders[] = order.split(",");
		// 配列を":"で区切り配列に格納
		for (int i = 0; i < orders.length; i++) {
			String animals[] = orders[i].split(":");
			// 区切った１つ目の要素を変数に格納
			String name = animals[0];
			// 区切った２つ目の要素をdouble型に変換し変数に格納 
			double length = Double.parseDouble(animals[1]);
			// 区切った3つ目の要素をint型に変換し変数に格納 
			int speed = Integer.parseInt(animals[2]);
			// コンストラクタでそれぞれを格納し出力
			Animals a = new Animals(name, length, speed);
			a.printInfo();
		}
	}
}