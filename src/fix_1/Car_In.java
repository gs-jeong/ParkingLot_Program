package fix_1;

import java.util.Scanner;

class In_Car {
	private int location;
	
	public void Into_Park(State[] state, Scanner input) {
		while (true) {
			Park.parking_state(state);
			System.out.print("������ ��ġ�� �����ϼ��� : ");
			location=input.nextInt();
			if (location>=11||location<=0) {
				System.out.println("---------------------------");
				System.out.println("������ ��ġ�� �ٽ� �������ּ���.");
			}
			else {
				if (state[location-1].getLocation()!=" �� ") {
					System.out.println("---------------------------");
					System.out.print("�̸��� �Է��ϼ��� : ");
					state[location-1].setName(input.next());
					System.out.print("�� ��ȣ�� �Է��ϼ��� : ");
					state[location-1].setCar_Number(input.next());
					while (state[location-1].getPassword().length()!=5) {
						System.out.print("��й�ȣ�� �Է��ϼ���(00000~99999) : ");
						state[location-1].setPassword(input.next());
						if (state[location-1].getPassword().length()<5||state[location-1].getPassword().length()>5) {
								System.out.println("���� ������ �Է����ֽʽÿ�.");
								System.out.println("---------------------------");
							}
						else {
							for (int i=0; i<state[location-1].getPassword().length();i++) {
								if (state[location-1].getPassword().charAt(i)>=0&&state[location-1].getPassword().charAt(i)<=9)
									continue;
								else {
									System.out.println("���� ������ �Է����ֽʽÿ�.");
									break;
								}
							}
							break;
						}
					}
					state[location-1].setLocation(" �� ");
					Park.parking_state(state);
					System.out.printf("%d�� �����Ǽ̽��ϴ�.\n",location);
					state[location-1].setIn_time(System.currentTimeMillis());
					break;
				}
				else {
					System.out.println("---------------------------");
					System.out.println("�̹� �����Ǿ� �ֽ��ϴ�.\n�ٸ� ���� �������ּ���.");
				}
			}
		}
	}
}