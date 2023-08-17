package process;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
	private String food;


	public void show() {
		Date exDate = new Date();
		SimpleDateFormat exDateFormat = new SimpleDateFormat("yyyy/MM/dd H:m:s");
		
		System.out.println("こんにちは！ここは日本です！");
		System.out.println("この " + this.food + "はうまい");
		System.out.println(this.food + "は和食です");
		System.out.println("今の現在日時は" +exDateFormat.format(exDate)+ "です");
	}
	
	public void setValiable(String food) {
		this.food = food;
		if ( food == null ) {
		    System.out.println("str == null");
		}

	}
	
}
