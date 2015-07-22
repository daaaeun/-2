package abstraction;

public class ShieldRobot extends BasicBot {

	private int shieldPoint;

	public void setShieldPoint(int shieldPoint) {
		this.shieldPoint = shieldPoint;
	}
	
	@Override
	public void status() {
		super.status();
		System.out.println("방어력 : " + this.shieldPoint);
	}
}
