package abstraction;

public class ShieldRobot extends BasicBot {

	private int shieldPoint;
	
	public void charge(int energy, int shielPoint) {
		super.charge(energy);
		this.shieldPoint = shielPoint;
	}
	@Override
	public void run(int speed) {
		super.run(speed);
	}
	
	@Override
	public void status() {
		super.status();
		System.out.println("방어력 : " + this.shieldPoint);
	}
}
