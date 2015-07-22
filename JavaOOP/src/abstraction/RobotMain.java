package abstraction;



public class RobotMain {
	public static void main(String[] args) {
		/*
		 GunRobot
		 ShieldRobot
		 
		 출력
		 건로봇은 속도는 10, 에너지는 10, 공격력은 50
		 -공격력은 인스턴스 변수로 int attactPoint
		 쉴드로봇은 속도는 20, 에너지는 20, 방어력은 50
		 -방어력은 인스턴스 변수로  int shieldPoint
		 
		 * */
		
		GunRobot gunRobot = new GunRobot();
		
		gunRobot.run(10);
		gunRobot.charge(10);
		gunRobot.setAttackPoint(50);
//		gunRobot.status();
		
		ShieldRobot shieldRobot = new ShieldRobot();
		
		shieldRobot.charge(20);
		shieldRobot.run(20);
		shieldRobot.setShieldPoint(50);
//		shieldRobot.status();
		
		Robot[] robots = new Robot[2];
		robots[0] = gunRobot;
		robots[1] = shieldRobot;
		
		//확장된 for문
		
		for (Robot robot : robots) {
			robot.status();
		}
		

		

		
		
	}
}
