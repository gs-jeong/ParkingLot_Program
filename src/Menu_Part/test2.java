package Menu_Part;

import java.util.Scanner;

class test2 {
	Car_In in = new Car_In();
	Car_Out out = new Car_Out();
	Exit_Program exit = new Exit_Program();
	Park park = new Park();
	Car_State state = new Car_State();
	
	public void play(Scanner input) {
		int number=0;
		System.out.println("	���� �ڵ��� ����	");
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
					in.Into_Park(park, input);
					break;
				case 2:
					out.Out_of_Parking_Lot(park, input);
					break;
				case 3:
					System.out.println("���� ��");
					break;
				default:
					exit.Exit();
					break;
				}
			}
		}
	}
}