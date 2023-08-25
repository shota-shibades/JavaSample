package Qes26_28;

public class Animals {

	String name;
	double length;
	int speed;
	String logicalName;

	String getlogicalName(String name) {
		switch (name) {
		case "ライオン":
			return "パンテラ レオ";
		case "ゾウ:":
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

	public Animals(String name, double length, int speed) {
		this.name = name;
		this.length = length;
		this.speed = speed;
		this.logicalName = getlogicalName(name);

	}

	// 出力用メソッド
	public void printInfo() {
		System.out.println("	動物名：" + this.name + "\n 体長：" + this.length + "m" + "\n 速度：" + this.speed + "km/h"
				+ "\n 学名：" + this.logicalName);
	}
}