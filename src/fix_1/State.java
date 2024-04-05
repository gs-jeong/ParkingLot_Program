package fix_1;

public class State {
	private String name="";
	private String Car_Number="";
	private long in_time=0;
	private long out_time=0;
	private String location=" O ";
	private long parking_time;
	private long charge;
	private String password="0";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCar_Number() {
		return Car_Number;
	}
	public void setCar_Number(String car_Number) {
		Car_Number = car_Number;
	}
	public long getIn_time() {
		return in_time;
	}
	public void setIn_time(long in_time) {
		this.in_time = in_time;
	}
	public long getOut_time() {
		return out_time;
	}
	public void setOut_time(long out_time) {
		this.out_time = out_time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getParking_time() {
		this.parking_time = this.out_time-this.in_time;
		return this.parking_time;
	}
	public long getCharge() {
		this.charge = (this.parking_time/1000)*500;
		return this.charge;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}