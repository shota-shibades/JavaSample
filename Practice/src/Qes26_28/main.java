package Qes26_28;

import java.util.Scanner;

import Qes26_28.Animals.chimpanzee;
import Qes26_28.Animals.elephant;
import Qes26_28.Animals.lion;
import Qes26_28.Animals.panda;
import Qes26_28.Animals.parakeet;
import Qes26_28.Animals.zebla;

public class main {

	public static void main(String[] args) {
		// scannerクラスを用意
		Scanner sc = new Scanner(System.in);
		Animals_sub As = new Animals_sub();
		String order = "";
		// コンソールに入力を要求
		System.out.println("コンソールに文字を入力してください");
		// コンソールの入力を変数orderに格納
		order = sc.nextLine();
		sc.close();
		// 入力された情報を引数にメソッドを呼び出す
		if (order.equals(lion.id) || order.equals(elephant.id) || order.equals(panda.id) || order.equals(chimpanzee.id)
				|| order.equals(zebla.id) || order.equals(parakeet.id))
		{
			As.output(order);
		}else{
			System.out.println("情報がありません");
		}
	}
}