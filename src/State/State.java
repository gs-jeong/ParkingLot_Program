package State;

import java.util.Date;

public class State { 
	 final static int MAX = 10;
	 Date date = new Date();
	 public Box box[] = new Box[MAX];

	 public State() {
		 this.create(MAX);
	 }

	 public void create(int a) {
		 for (int i=0; i<a; i++) {
			 box[i] = new Box();
		 }
		 for (int i=0; i<a; i++) {
			 box[i].setNum("("+i+")");
		 }
	 }

	 public void print_state() {
		 System.out.println("=============================\n   << ���� ������ ����  >>");
		 for (int i=0; i<MAX/2; i++) {
			 System.out.print("["+box[i].getNum()+"]");
		 }
		 System.out.println();
		 for (int i=MAX/2; i<MAX; i++) {
			 System.out.print("["+box[i].getNum()+"]");
		 }
		 System.out.println();
	 }
	 
	 public void init(int a) {
		 box[a].setNum("("+a+")");
		 box[a].setName("");
		 box[a].setCar_num("");
		 box[a].setIn("");
		 box[a].setOut("");
		 box[a].setCharge(0);
	 }

	 public void charges(int a) {
		 if (box[a].getNum() == " �� ") {
			 box[a].charge = ((int)((box[a].out_time - box[a].in_time)/500))*10;
		 }
	 }

	 public void charge_inform(int i) {
		 System.out.println("=============================\n [ "+i+" ]");
		 System.out.println("�����ð� : "+box[i].getIn());
		 System.out.println("�����ð� : "+box[i].getOut());
		 if (box[i].getNum() == " �� ") {
			 box[i].out_time = System.currentTimeMillis();
		 }
		 charges(i);
		 System.out.println("������� : "+box[i].getCharge()+"��");
	 }
}