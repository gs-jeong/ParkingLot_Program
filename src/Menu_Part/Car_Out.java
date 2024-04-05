package Menu_Part;

import java.util.Scanner;

class Car_Out {
	private int location;
	
	public void Out_of_Parking_Lot(Park park, Scanner input) {
		while (true) {
			park.parking_state();
			System.out.print("출차할 차의 위치를 선택하세요 : ");
			location=input.nextInt();
			if (location>=11||location<=0) {
				System.out.println("---------------------------");
				System.out.println("출차할 위치가 잘못 되었습니다.\n다시 선택해주세요.");
			}
			else {
				if (park.state[location-1].getLocation()==" ■ ") {
					park.state[location-1].setLocation(" O ");
					park.parking_state();
					System.out.printf("%d에서 출차되셨습니다.\n",location);
					park.state[location-1].setOut_time(System.currentTimeMillis());
					System.out.printf("주차한 시간 : %d분 %d초\n",park.state[location-1].getParking_time()/60000,(park.state[location-1].getParking_time()/1000)%60);
					System.out.printf("요금 : %d원\n",park.state[location-1].getCharge());
					break;
				}
				else {
					System.out.println("---------------------------");
					System.out.println("차가 주차되어 있지 않습니다.\n다른 곳을 선택해주세요.");
				}
			}
		}
	}
}