package Menu_Part;

public class Park {
	Car_State[] state = new Car_State[10];
	
	public Park() {
		int i=0;
		while (i<10) {
			state[i] = new Car_State();
			i++;
		}
	}
	
	public void parking_state() {
		int Car_Num = 0;
		System.out.println("----------------------------------");
		while (Car_Num<10) {
			System.out.printf(" {%s} ", state[Car_Num].getLocation());
			
			if (Car_Num==4)
				System.out.println();
			Car_Num++;
		}
		System.out.println();
		System.out.println("----------------------------------");
	}
}