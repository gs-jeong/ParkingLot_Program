package fix_1;

import java.util.Scanner;

class Out_Car {
	private int location;
	
	public void Out_of_Parking_Lot(State[] state, Scanner input) {
		while (true) {
			Park.parking_state(state);
			System.out.print("������ ���� ��ġ�� �����ϼ��� : ");
			location=input.nextInt();
			if (location>=11||location<=0) {
				System.out.println("---------------------------");
				System.out.println("������ ��ġ�� �߸� �Ǿ����ϴ�.\n�ٽ� �������ּ���.");
			}
			else {
				String password="0";
				if (state[location-1].getLocation()==" �� ") {
					while (password!=state[location-1].getPassword()) {
						System.out.print("��й�ȣ�� �Է��ϼ��� : ");
						password=input.next();
						if (password==state[location-1].getPassword()) {
							state[location-1].setLocation(" O ");
							Park.parking_state(state);
							System.out.printf("%d���� �����Ǽ̽��ϴ�.\n",location);
							state[location-1].setOut_time(System.currentTimeMillis());
							System.out.printf("������ �ð� : %d�� %d��\n",state[location-1].getParking_time()/60000,(state[location-1].getParking_time()/1000)%60);
							System.out.printf("��� : %d��\n",state[location-1].getCharge());
						}
						else {
							System.out.println("��й�ȣ�� Ʋ���ϴ�.\n�ٽ� �Է��Ͽ� �ֽʽÿ�.");
						}
					}
				}
				else {
					System.out.println("---------------------------");
					System.out.println("���� �����Ǿ� ���� �ʽ��ϴ�.\n�ٸ� ���� �������ּ���.");
				}
			}
		}
	}
}