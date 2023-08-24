package Qes26_28;

public class Animals {

	String name;
	double length;
	int speed;
	String logicalName;

	public void get(String id[]) {
		// 受け取った配列の要素数だけ繰り返すfor文
		for (int i = 0; i < id.length; i++) {
			switch (id[i]) {
			// 下記の値を受け取った場合対応する動物の情報をそれぞれの変数に代入しprintInfo()で出力
			case "ライオン:2.1:80": {
				this.name = lion.name;
				this.length = lion.length;
				this.speed = lion.speed;
				this.logicalName = lion.logicalName;
				printInfo();
				break;
			}
			case "ゾウ:3.2:40": {
				this.name = elephant.name;
				this.length = elephant.length;
				this.speed = elephant.speed;
				this.logicalName = elephant.logicalName;
				printInfo();
				break;
			}
			case "パンダ:1.9:30": {
				this.name = panda.name;
				this.length = panda.length;
				this.speed = panda.speed;
				this.logicalName = panda.logicalName;
				printInfo();
				break;
			}
			case "チンパンジー:0.94:25": {
				this.name = chimpanzee.name;
				this.length = chimpanzee.length;
				this.speed = chimpanzee.speed;
				this.logicalName = chimpanzee.logicalName;
				printInfo();
				break;
			}
			case "シマウマ:2.4:65": {
				this.name = zebla.name;
				this.length = zebla.length;
				this.speed = zebla.speed;
				this.logicalName = zebla.logicalName;
				printInfo();
				break;
			}
			case "インコ:0.1:50": {
				this.name = parakeet.name;
				this.length = parakeet.length;
				this.speed = parakeet.speed;
				this.logicalName = parakeet.logicalName;
				printInfo();
				break;
			}
			// 当てはまらない値を受け取った場合の出力
			default:
				System.out.println("不明");
			}
		}
	}

	// 出力用メソッド
	public void printInfo() {
		System.out.println("	動物名：" + this.name + "\n 体長：" + this.length + "m" + "\n 速度：" + this.speed + "km/h"
				+ "\n 学名：" + this.logicalName);
	}

	// それぞれの動物の情報を格納　変数idはmainクラスで分岐するときに使用
	class lion {
		static String name = "ライオン";
		static double length = 2.1;
		static int speed = 80;
		static String logicalName = "パンテラ レオ";
	}

	class elephant {
		static String name = "ゾウ";
		static double length = 3.2;
		static int speed = 40;
		static String logicalName = "ロキソドンタ・サイクロティス";
	}

	class panda {
		static String name = "パンダ";
		static double length = 1.9;
		static int speed = 30;
		static String logicalName = "アイルロポダ・メラノレウ";
	}

	class chimpanzee {
		static String name = "チンパンジー";
		static double length = 0.94;
		static int speed = 25;
		static String logicalName = "パン・トゥログロディテス";
	}

	class zebla {
		static String name = "シマウマ";
		static double length = 2.4;
		static int speed = 65;
		static String logicalName = "チャップマンシマウマ";
	}

	class parakeet {
		static String name = "インコ";
		static double length = 0.1;
		static int speed = 50;
		static String logicalName = "不明";
	}
}
