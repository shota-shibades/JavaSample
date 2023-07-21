package curriculum_B;

public class Qes4 {
	
	public static void main(String[] args) {
		
		byte i = 00;
		byte b = 00;
		for (i = 01; i<=9; i++) {
			System.out.println();
			for (b = 01; b<=9; b++) {
				String outStr = String.format("%02d", i,b);
				System.out.print(i + " * "+ b + " = " + i * b + " ||");
			}
		}
			
		}
	}
 