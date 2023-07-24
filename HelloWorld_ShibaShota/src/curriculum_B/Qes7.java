package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		
		System.out.printf("生徒の人数を入力してください（2以上）");
		Scanner scan = new Scanner(System.in);
		int students = scan.nextInt();
		int[][] Transcript = new int[students][4];
		String subject[]= {"英語","数学","理科","社会"};
				
		for(int i=0; i< Transcript.length; i++) {
			for(int s=0; s<4; s++) {
				System.out.printf("%d人目の『%s』の点数を入力してください ",i+1,subject[s]);
				Scanner sc = new Scanner(System.in);
				Transcript[i][s]= sc.nextInt();
			}
			System.out.println();
		}
		
		
		int count = 0;
		for(int person[] :Transcript) {
			double total = 0;
			for(int score :person) {
				total += score;
				}
			double avarage = total/4;
			count++;
			System.out.printf("%d人目の平均点は%.2f点です。\n",count,avarage);
			}
		for(int kamoku=0; kamoku < 4; kamoku++) {
			double goukei = 0;
			for(int tensuu=0; tensuu < Transcript.length; tensuu++) {
				goukei += Transcript[tensuu][kamoku];
			}
			double heikin = goukei / Transcript.length;
			System.out.printf("%sの平均点は%.2f点です。\n",subject[kamoku],heikin);
		}
	}
}
