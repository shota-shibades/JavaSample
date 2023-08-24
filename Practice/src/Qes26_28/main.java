package Qes26_28;

import java.util.Scanner;

public class main {

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
		// 受け取った変数を","で区切って配列に格納
		String orders[] = order.split(",");
		// 入力された情報を引数にメソッドを呼び出す
		Animals a = new Animals();
		a.get(orders);
	}
}