package Menu_Part;

import java.util.Scanner;

class Car_In {
	private int location;
	
	public void Into_Park(Park park, Scanner input) {
		while (true) {
			park.parking_state();
			System.out.print("������ ��ġ�� �����ϼ��� : ");
			location=input.nextInt();
			if (location>=11||location<=0) {
				System.out.println("---------------------------");
				System.out.println("������ ��ġ�� �ٽ� �������ּ���.");
			}
			else {
				if (park.state[location-1].getLocation()!=" �� ") {
					System.out.println("---------------------------");
					System.out.print("�̸��� �Է��ϼ��� : ");
					park.state[location-1].setName(input.next());
					System.out.print("�� ��ȣ�� �Է��ϼ��� : ");
					park.state[location-1].setCar_Number(input.next());
					park.state[location-1].setLocation(" �� ");
					park.parking_state();
					System.out.printf("%d�� �����Ǽ̽��ϴ�.\n",location);
					park.state[location-1].setIn_time(System.currentTimeMillis());
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