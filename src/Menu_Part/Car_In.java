package Menu_Part;

import java.util.Scanner;

class Car_In {
	private int location;
	
	public void Into_Park(Park park, Scanner input) {
		while (true) {
			park.parking_state();
			System.out.print("주차할 위치를 선택하세요 : ");
			location=input.nextInt();
			if (location>=11||location<=0) {
				System.out.println("---------------------------");
				System.out.println("주차할 위치를 다시 선택해주세요.");
			}
			else {
				if (park.state[location-1].getLocation()!=" ■ ") {
					System.out.println("---------------------------");
					System.out.print("이름을 입력하세요 : ");
					park.state[location-1].setName(input.next());
					System.out.print("차 번호를 입력하세요 : ");
					park.state[location-1].setCar_Number(input.next());
					park.state[location-1].setLocation(" ■ ");
					park.parking_state();
					System.out.printf("%d에 주차되셨습니다.\n",location);
					park.state[location-1].setIn_time(System.currentTimeMillis());
					break;
				}
				else {
					System.out.println("---------------------------");
					System.out.println("이미 주차되어 있습니다.\n다른 곳을 선택해주세요.");
				}
			}
		}
	}
}