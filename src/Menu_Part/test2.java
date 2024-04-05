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
		System.out.println("	무인 자동차 관리	");
		while (number!=4) {
			System.out.println("---------------------------");
			System.out.println("1) 주차   2) 출차   3) 관리   4) 종료");
			System.out.println("---------------------------");
			System.out.print("숫자를 선택하세요 : ");
			number = input.nextInt();
			if (number>=5||number<1) {
				System.out.println("---------------------------");
				System.out.println("숫자를 다시 입력해주세요.");
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
					System.out.println("개발 중");
					break;
				default:
					exit.Exit();
					break;
				}
			}
		}
	}
}