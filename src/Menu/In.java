package Menu;

import java.util.Scanner;

import State.State;

import java.util.Date;

public class In {
	Date date = new Date();
	
	void in(State state, Scanner s) {
		int num = 0;
		String name = "";
		String car_num = "";
		
		System.out.println("=============================\n ���� �� ���� ��ȣ�� ���ÿ�.");
		num = s.nextInt();
        if (state.box[num].getNum()!=" �� ") {
        	System.out.print("�̸� : ");
        	name = s.next();
        	
        	System.out.print("������ȣ : ");
    	    car_num = s.next();
    	    
    	    state.box[num].setName(name);
    	    state.box[num].setCar_num(car_num);
    	    state.box[num].setNum(" �� ");
    	    state.box[num].setIn(date.toString());
    	    state.box[num].in_time = System.currentTimeMillis ();
    	    state.box[num].out_time = System.currentTimeMillis ();

    	    System.out.println();

    	    System.out.println("("+num+")�� ������ ������ �����Ǿ����ϴ�.");
        }
        else {
        	System.out.println("�̹� ������ �Ǿ��ְų�, �߸��� ��ȣ�� �����̽��ϴ�.");
        }
        state.print_state();
	}
}