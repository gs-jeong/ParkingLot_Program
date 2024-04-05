package fix_1;

import java.util.Scanner;

class Out_Car {
	private int location;
	
	public void Out_of_Parking_Lot(State[] state, Scanner input) {
		while (true) {
			Park.parking_state(state);
			System.out.print("출차할 차의 위치를 선택하세요 : ");
			location=input.nextInt();
			if (location>=11||location<=0) {
				System.out.println("---------------------------");
				System.out.println("출차할 위치가 잘못 되었습니다.\n다시 선택해주세요.");
			}
			else {
				String password="0";
				if (state[location-1].getLocation()==" ■ ") {
					while (password!=state[location-1].getPassword()) {
						System.out.print("비밀번호를 입력하세요 : ");
						password=input.next();
						if (password==state[location-1].getPassword()) {
							state[location-1].setLocation(" O ");
							Park.parking_state(state);
							System.out.printf("%d에서 출차되셨습니다.\n",location);
							state[location-1].setOut_time(System.currentTimeMillis());
							System.out.printf("주차한 시간 : %d분 %d초\n",state[location-1].getParking_time()/60000,(state[location-1].getParking_time()/1000)%60);
							System.out.printf("요금 : %d원\n",state[location-1].getCharge());
						}
						else {
							System.out.println("비밀번호가 틀립니다.\n다시 입력하여 주십시오.");
						}
					}
				}
				else {
					System.out.println("---------------------------");
					System.out.println("차가 주차되어 있지 않습니다.\n다른 곳을 선택해주세요.");
				}
			}
		}
	}
}