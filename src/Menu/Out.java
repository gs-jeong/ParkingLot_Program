package Menu;

import java.util.Scanner;

import State.State;

import java.util.Date;

public class Out {
	void out(State state, Scanner s) {
		int num = 0;
		System.out.println("=============================\n ���� �ߴ� ���� ��ȣ�� ���ÿ�.");
		num = s.nextInt();
		
		try {
			if(state.box[num].getNum() == " �� ") {
				Date date = new Date();
				state.box[num].setOut(date.toString());
				state.box[num].out_time = System.currentTimeMillis ();
				System.out.println();
				System.out.println(" ("+num+")�� ������ ������ �����Ǿ����ϴ�.");
				state.charge_inform(num);
				state.init(num);
			}
			else {
				System.out.println("�̹� ������ �Ǿ��ְų�, �߸��� ��ȣ�� �����̽��ϴ�.");
			}
		}
		catch (Exception e) {
			
		}
		
		state.print_state();
	}
}