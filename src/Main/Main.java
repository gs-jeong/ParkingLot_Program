package Main;

import java.util.Scanner;

import Menu.Menu;

public class Main {
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		Scanner temp = new Scanner(System.in);
		menu.play(temp);
	}
}