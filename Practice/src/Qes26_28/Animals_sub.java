package Qes26_28;

public class Animals_sub extends Animals {
	// Animalクラスを継承

	public String id;
	//Animals a = new Animals();

	public void output(String id) {
		// switch文で引数の情報に応じて分岐
		switch (id) {
		case "2.1:80": {
			lion animal = new lion();
			// 出力
			System.out.println("	動物名：" + animal.name + "\n 体長：" + animal.length + "m" + "\n 速度：" + animal.speed + "km/h"
					+ "\n 学名：" + animal.logicalName);
			// 処理を終了
			break;
		}
		case "3.2:40": {
			// 出力
			elephant animal = new elephant();
			System.out.println("	動物名：" + animal.name + "\n 体長：" + animal.length + "m" + "\n 速度：" + animal.speed + "km/h"
					+ "\n 学名：" + animal.logicalName);
			// 処理を終了
			break;
		}
		case "1.9:30": {
			panda animal = new panda();
			// 出力
			System.out.println("	動物名：" + animal.name + "\n 体長：" + animal.length + "m" + "\n 速度：" + animal.speed + "km/h"
					+ "\n 学名：" + animal.logicalName);
			// 処理を終了
			break;
		}
		case "0.94:25": {
			chimpanzee animal = new chimpanzee();
			// 出力
			System.out.println("	動物名：" + animal.name + "\n 体長：" + animal.length + "m" + "\n 速度：" + animal.speed + "km/h"
					+ "\n 学名：" + animal.logicalName);
			// 処理を終了
			break;
		}
		case "2.4:65": {
			zebla animal = new zebla();
			// 出力
			System.out.println("	動物名：" + animal.name + "\n 体長：" + animal.length + "m" + "\n 速度：" + animal.speed + "km/h"
					+ "\n 学名：" + animal.logicalName);
			// 処理を終了
			break;
		}
		case "0.1:50": {
			parakeet animal = new parakeet();
			// 出力
			System.out.println("	動物名：" + animal.name + "\n 体長：" + animal.length + "m" + "\n 速度：" + animal.speed + "km/h"
					+ "\n 学名：" + animal.logicalName);
			// 処理を終了
			break;
		}
			
		}
	}
}