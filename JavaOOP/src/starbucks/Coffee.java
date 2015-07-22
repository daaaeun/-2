package starbucks;

public class Coffee implements Recipe{
	
	private String coffeename;
	
	@Override
	public void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("1. 물을 끓인다.");
	}

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("2. 커피를 내린다.");
	}

	@Override
	public void pourInCup() {
		// TODO Auto-generated method stub
		System.out.println("3. 물을 컵에 붓는다.");
		
	}

	@Override
	public void select(int option) {
		// TODO Auto-generated method stub
/*		if (option == 1) {
			this.coffeename = "블랙";
		}
		else {
			this.coffeename = "밀크";
		}
*/
		switch (option) {
		case 1 :
			this.coffeename = "블랙";
			break;
		case 2 : 
			this.coffeename = "밀크";
			break;
		default:
			this.coffeename = "선택오류";
			break;
		}
	}
	
		

	@Override
	public void serve() {
		// TODO Auto-generated method stub
		System.out.println("5. 커피를 제공한다.");
		System.out.println("고객님 " + this.coffeename+ "커피가 나왔습니다.");
	}
	

}
