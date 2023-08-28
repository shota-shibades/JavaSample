package Qes28_29;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	/*
	 	
	 	0, "北海道:札幌市:83424"
		1, "青森県:青森市:9646"
		2, "岩手県:盛岡市:15275"
		3, "宮城県:仙台市:7282"
		4, "秋田県:秋田市:11638"
		5, "山形県:山形市:9323"
		6, "福島県:福島市:13784"
		7, "茨城県:水戸市:6097"
		8, "栃木県:宇都宮市:6408"
		9, "群馬県:前橋市:6362"
		10, "埼玉県:さいたま市:3798"
	 	
	 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	 	都道府県がソートされてコンソールに出力されるように作ってください
	※Packageを2つ作ってください
	※複数選択できるようにしてください
	
	例:
	8,5,9,.....
	と入力された場合（昇順）
	
	都道府県名：山形県
		県庁所在地：山形市
		面積：9323.0km2
	
	都道府県名：栃木県
		県庁所在地：宇都宮市
		面積：6408.0km2
	
	都道府県名：群馬県
		県庁所在地：前橋市
		面積：6362.0km2
		
	 */

	public static void main(String[] args) {
		// scannerクラスを用意
		Scanner sc = new Scanner(System.in);
		String order = "";
		// コンソールに入力を要求
		System.out.println("コンソールに0から10までの数字を入力してください。\n複数入力する場合は’,’で区切ること。\nまた昇順、降順いずれかを入力してください。");
		// コンソールの入力を変数に格納
		order = sc.nextLine();
		// nullチェック
		if (order == null) {
			System.out.println("入力中情報が正しくありません");
		}
		// 数字とカンマ以外を取り除き変数に代入
		String number = order.replaceAll("[^0-9,]", "");
		// 受け取った変数を","で区切って配列に格納
		String array[] = number.split(",");
		// int型の配列を作成
		Integer numbers[] = new Integer[array.length];
		// for文で配列arrayをint型に変換
		for (int i = 0; i < array.length; i++) {
			numbers[i] = Integer.parseInt(array[i]);
		}
		sc.close();

		// コンソールから取得した文字列に昇順、降順の指定があった場合、配列を指定の通り並べ替える
		if (order.contains("昇順")) {
			// 配列を昇順に並べ替え
			Arrays.sort(numbers);
		}
		if (order.contains("降順")) {
			// 配列を降順に並べ替え
			Arrays.sort(numbers, Collections.reverseOrder());
		}

		// 処理用のクラスをインスタンス化
		Qes28_29_2.Processer pr = new Qes28_29_2.Processer();
		// for文で配列の数を順に代入して出力
		for (int i = 0; i < numbers.length; i++) {
			pr.printInfo(numbers[i]);
		}

	}

}
