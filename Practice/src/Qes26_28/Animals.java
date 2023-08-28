package Qes26_28;

public class Animals {

	// 他のクラスから直接変更ができないようにアクセス修飾子private
	private String name;
	private double length;
	private int speed;
	private String logicalName;

	// 名前から学名を取得できるコンストラクタ
	public String getlogicalName(String name) {
		switch (name) {
		case "ライオン":
			return "パンテラ レオ";
		case "ゾウ":
			return "ロキソドンタ・サイクロティス";
		case "パンダ":
			return "アイルロポダ・メラノレウ";
		case "チンパンジー":
			return "パン・トゥログロディテス";
		case "シマウマ":
			return "チャップマンシマウマ";
		default:
			return "不明";
		}
	}

	// 取得した学名とコンソールから取得した変数を代入
	public Animals(String name, double length, int speed) {
		this.name = name;
		this.length = length;
		this.speed = speed;
		this.logicalName = getlogicalName(name);

	}

	// 出力用メソッド
	public void printInfo() {
		System.out.println(" 動物名：" + this.name + "\n 体長：" + this.length + "m" + "\n 速度：" + this.speed + "km/h"
				+ "\n 学名：" + this.logicalName);
	}
}