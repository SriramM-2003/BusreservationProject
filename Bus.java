package busreservation;

public class Bus {
	private int  busno;
	private boolean ac;
	private int capacity;
	Bus(int no,boolean ac,int cap){
		busno=no;
		this.ac=ac;
		capacity=cap;
	}
	public int getbusno() {
		return busno;
	}
	
	
	public void capacityChange(int busNo)
	{
		Busresservation buscap = new Busresservation();
		
	}
	public boolean isac() {
		return ac;
	}
	public int getcapacity() {
		return capacity;
	}

	public void setbusno(int no) {
		busno=no;
	}

	public void setac(boolean val) {
		ac=val;
	}
	public void setcapacity(int cap) {
		capacity=cap;
	}
	public void displaybus() {
		System.out.println("  Bus no:"+ busno+"  Ac:"+ ac+"  capacity:"+capacity); 
	}
	
}
