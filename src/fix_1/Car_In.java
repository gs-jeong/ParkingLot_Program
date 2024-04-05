package fix_1;

import java.util.Scanner;

class In_Car {
	private int location;
	
	public void Into_Park(State[] state, Scanner input) {
		while (true) {
			Park.parking_state(state);
			System.out.print("주차할 위치를 선택하세요 : ");
			location=input.nextInt();
			if (location>=11||location<=0) {
				System.out.println("---------------------------");
				System.out.println("주차할 위치를 다시 선택해주세요.");
			}
			else {
				if (state[location-1].getLocation()!=" ■ ") {
					System.out.println("---------------------------");
					System.out.print("이름을 입력하세요 : ");
					state[location-1].setName(input.next());
					System.out.print("차 번호를 입력하세요 : ");
					state[location-1].setCar_Number(input.next());
					while (state[location-1].getPassword().length()!=5) {
						System.out.print("비밀번호를 입력하세요(00000~99999) : ");
						state[location-1].setPassword(input.next());
						if (state[location-1].getPassword().length()<5||state[location-1].getPassword().length()>5) {
								System.out.println("범위 내에서 입력해주십시오.");
								System.out.println("---------------------------");
							}
						else {
							for (int i=0; i<state[location-1].getPassword().length();i++) {
								if (state[location-1].getPassword().charAt(i)>=0&&state[location-1].getPassword().charAt(i)<=9)
									continue;
								else {
									System.out.println("범위 내에서 입력해주십시오.");
									break;
								}
							}
							break;
						}
					}
					state[location-1].setLocation(" ■ ");
					Park.parking_state(state);
					System.out.printf("%d에 주차되셨습니다.\n",location);
					state[location-1].setIn_time(System.currentTimeMillis());
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