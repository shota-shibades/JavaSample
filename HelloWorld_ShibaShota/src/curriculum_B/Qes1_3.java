package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {
	
	public static void main(String[] args) {
		
		
		/* 1.)ログイン時の入力チェックシステムを下記条件で作成してください	
		 *	・コンソールにユーザー名を入力できるようにしてください	
		 *	・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください	
		 *	・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください	
		 *	・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください	
		 */
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();
		
		
		if(userName.length() > 10) {
			System.out.println("「名前を10文字以内にしてください」");
		
		}else if (userName.length() == 0 || userName == null) {
			System.out.println("「名前を入力してください」");
			
		}else if (userName.matches("[^A-Za-z0-9]+")){
			System.out.println("「半角英数字のみで名前を入力してください」");
			
		}else {
			System.out.println(userName + "「 入力したユーザー名 」を登録しました」");
		}
			
	}

}
