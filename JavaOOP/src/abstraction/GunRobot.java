package abstraction;

public class GunRobot extends BasicBot{
	
	private int attackPoint;
	
	public void charge(int energy, int attackPoint) {
		super.charge(energy);
		this.attackPoint = attackPoint;
	}
	@Override
	public void run(int speed) {
		super.run(speed);
	}

	@Override
	public void status() {
		super.status();
		System.out.println("공격력 : " + this.attackPoint );
	}
}
