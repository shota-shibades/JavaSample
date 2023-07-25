package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		// 入力の指示を出力
		System.out.printf("生徒の人数を入力してください（2以上）");
		// scannerを用意
		Scanner sc = new Scanner(System.in);
		// 取得した数を変数studentに格納
		int students = sc.nextInt();
		// 多次元配列Transcriptを作成(成績を示すTranscript)
		// 取得した数の配列の中に、要素が4つの配列の構成で定義
		int[][] Transcript = new int[students][4];
		// 配列subjectに4教科を格納
		String subject[] = { "英語", "数学", "理科", "社会" };

		// 生徒の人数繰り返すfor文を定義
		for (int i = 0; i < Transcript.length; i++) {
			// for文の中にさらにfor文で、4教科で4回回すよう定義
			for (int s = 0; s < subject.length; s++) {
				// 点数の入力の指示を出力。配列は1つ目の引数が0から始まるので、"%d人目の"
				// %dにはi+1で、1人目→2人目→3人目→・・・となる
				System.out.printf("%d人目の『%s』の点数を入力してください ", i + 1, subject[s]);
				// 変数scoreを多次元配列Transcriptの配列の中の配列に格納
				Transcript[i][s] = sc.nextInt();

				// ここまでのfor文の点数の格納のイメージは
				// Transcript[0][0]→Transcript[0][1]→Transcript[0][2]→Transcript[0][3]→
				// Transcript[1][0]→Transcript[1][1]→Transcript[1][2]→Transcript[1][3]→・・・

			}
			// 改行
			System.out.println();
		}

		// 取り出しはfor文と拡張for文両方を使ってみる
		// 変数countを用意
		int count = 0;
		// ２次元配列の１次元目の数だけ繰り返すfor文
		//       ○{○,○,○,○}
		// ○{}〈
		// ↑     ○{○,○,○,○}
		//
		//       ○{○,○,○,○}
		// ○{}〈
		// ↑     ○{○,○,○,○}
		// 上図の矢印の部分の数分繰り返すイメージ
		for (int person[] : Transcript) {
			// 平均値を求める為、先ず合計を格納する変数totalを用意。小数以下までの数が必要なので型はdouble
			double total = 0;
			// ２次元配列の２次元目の数だけ繰り返すfor文
			//       ○{○,○,○,○}
			// ○{}〈 ↑
			//       ○{○,○,○,○}
			//       ↑
			//       ○{○,○,○,○}
			// ○{}〈 ↑
			//       ○{○,○,○,○}
			//       ↑
			// 上図の矢印の部分の数分繰り返すイメージ
			for (int score : person) {
				// 変数totalに変数scoreを加算
				total += score;
			}
			// 合計値から科目数を割って平均値を計算
			double avarage = total / subject.length;
			// n人目の平均点なので繰り返しごとに変数countをインクリメント
			count++;
			// 出力
			System.out.printf("%d人目の平均点は%.2f点です。\n", count, avarage);
		}

		// 各科目ごとの平均値を求めたいので、科目数繰り返すfor文
		for (int kamoku = 0; kamoku < subject.length; kamoku++) {
			// 平均値を求める為、先ず合計を格納する変数totalを用意。小数以下までの数が必要なので型はdouble
			double total = 0;
			// 生徒数回繰り返すfor文
			for (int tensuu = 0; tensuu < Transcript.length; tensuu++) {
				// 変数totalに飼う生徒の対応する教科の点数を加算
				total += Transcript[tensuu][kamoku];
			}
			// 合計値から生徒数を割って平均値を計算
			double heikin = total / Transcript.length;
			// 出力
			System.out.printf("%sの平均点は%.2f点です。\n", subject[kamoku], heikin);
		}
		sc.close();
	}
}
