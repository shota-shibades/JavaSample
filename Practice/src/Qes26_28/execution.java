package Qes26_28;

import java.util.Scanner;

public class execution {

	public static void main(String[] args) {
		// scannerクラスを用意
		Scanner sc = new Scanner(System.in);
		//Animals_sub As = new Animals_sub();
		String order = "";
		// コンソールに入力を要求
		System.out.println("コンソールに文字を入力してください");
		// コンソールの入力を変数orderに格納
		order = sc.nextLine();
		sc.close();
		// 受け取った変数を","で区切って配列ordersに格納
		String orders[] = order.split(",");
		// 配列ordersを":"で区切り配列Animalに格納
		for (int i = 0; i < orders.length; i++) {
			String Animal[] = orders[i].split(":");
			// 区切った１つ目の要素を変数nameに格納
			String name = Animal[0];
			// 区切った２つ目の要素をdouble型に変換し変数speedに格納 
			double length = Double.parseDouble(Animal[1]);
			// 区切った3つ目の要素をint型に変換し変数speedに格納 
			int speed = Integer.parseInt(Animal[2]);
			// コンストラクタでそれぞれを格納し出力
			Animals a = new Animals(name, length, speed);
			a.printInfo();
		}
	}
}