package Qes28_29_2;

public class Processer {
	String[][] prefectures = {{"北海道","札幌市","83424"},{"青森県","青森市","9646"},{"岩手県","盛岡市","15275"},
			{"宮城県","仙台市","7282"},{"秋田県","秋田市","11638"},{"山形県","山形市","9323"},{"福島県","福島市","13784"},
			{"茨城県","水戸市","6097"},{"栃木県","宇都宮市","6408"},{"群馬県","前橋市","6362"},{"埼玉県","さいたま市","3798"}};
	
	public void printInfo(int num){
		System.out.println("\n都道府県名:"+ prefectures[num][0] +"\n県庁所在地:"+ prefectures[num][1] +"\n面積"+prefectures[num][2] + ".0km2");
	}
}

