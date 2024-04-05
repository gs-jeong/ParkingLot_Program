package fix_1;

import java.util.Scanner;

public class Park {
	In_Car in = new In_Car();
	Out_Car out = new Out_Car();
	Exit exit = new Exit();
	private static final int NumOfCar = 10; 
	State[] state = new State[NumOfCar];
	
	public Park() {
		for (int i=0; i<10; i++) {
			state[i] = new State();
		}
	}
	
	public static void parking_state(State[] state) {
		int Car_Num = 0;
		System.out.println("----------------------------------");
		while (Car_Num<10) {
			System.out.printf(" {%s} ", state[Car_Num].getLocation());
			
			if (Car_Num==4)
				System.out.println();
			Car_Num++;
		}
		System.out.println();
		System.out.println("----------------------------------");
	}
	
	public void play(Scanner input) {
		int number=0;
		System.out.println("	���� �ڵ��� ����");
		while (number!=4) {
			System.out.println("---------------------------");
			System.out.println("1) ����   2) ����   3) ����   4) ����");
			System.out.println("---------------------------");
			System.out.print("���ڸ� �����ϼ��� : ");
			number = input.nextInt();
			if (number>=5||number<1) {
				System.out.println("---------------------------");
				System.out.println("���ڸ� �ٽ� �Է����ּ���.");
			}
			else {
				switch (number) {
				case 1:
					in.Into_Park(state, input);
					break;
				case 2:
					out.Out_of_Parking_Lot(state, input);
					break;
				case 3:
					System.out.println("���� ��");
					break;
				default:
					exit.Exit_Menu();
					break;
				}
			}
		}
	}
}