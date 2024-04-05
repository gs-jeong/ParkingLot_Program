package fix_1;

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		Park menu = new Park();
		Scanner input = new Scanner(System.in);
		
		menu.play(input);
	}
}