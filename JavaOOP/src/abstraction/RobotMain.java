package abstraction;

import java.awt.Robot;

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
		gunRobot.charge(10, 50);
		gunRobot.run(10);
		
		ShieldRobot shieldRobot = new ShieldRobot();
		shieldRobot.charge(20, 50);
		shieldRobot.run(20);
		

		

		
		
	}
}
