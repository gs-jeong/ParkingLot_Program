package Menu_Part;

import java.util.Scanner;

class Car_Out {
	private int location;
	
	public void Out_of_Parking_Lot(Park park, Scanner input) {
		while (true) {
			park.parking_state();
			System.out.print("������ ���� ��ġ�� �����ϼ��� : ");
			location=input.nextInt();
			if (location>=11||location<=0) {
				System.out.println("---------------------------");
				System.out.println("������ ��ġ�� �߸� �Ǿ����ϴ�.\n�ٽ� �������ּ���.");
			}
			else {
				if (park.state[location-1].getLocation()==" �� ") {
					park.state[location-1].setLocation(" O ");
					park.parking_state();
					System.out.printf("%d���� �����Ǽ̽��ϴ�.\n",location);
					park.state[location-1].setOut_time(System.currentTimeMillis());
					System.out.printf("������ �ð� : %d�� %d��\n",park.state[location-1].getParking_time()/60000,(park.state[location-1].getParking_time()/1000)%60);
					System.out.printf("��� : %d��\n",park.state[location-1].getCharge());
					break;
				}
				else {
					System.out.println("---------------------------");
					System.out.println("���� �����Ǿ� ���� �ʽ��ϴ�.\n�ٸ� ���� �������ּ���.");
				}
			}
		}
	}
}