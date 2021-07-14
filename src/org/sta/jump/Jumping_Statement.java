package org.sta.jump;

public class Jumping_Statement {
	public static void main(String[] args) {
		
		for (int i = 0; i < 30; i++) {
			
			if (i==10 || i==20 || i==25) {
				continue;
				
			}
			
			System.out.println(i);
			
		}
	}

}
