package Menu;
import State.State;

public class Manage {

	void inform(State state) {
		System.out.println("=============================\n << ���� ���� ĭ �� ���� >>");

		for(int i=0; i<state.box.length; i++) {
			state.charge_inform(i);
			System.out.println("�̸� : "+state.box[i].getName());
			System.out.println("������ȣ : "+state.box[i].getCar_num());
		}
	}
}