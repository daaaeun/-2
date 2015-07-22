package starbucks;

public class AngelCoffee extends DrinkRecipe{
	private String coffeename;

	@Override
	void brew() {
		System.out.println("커피를 내린다.");
		
	}

	@Override
	void select(int option) {
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
	void serve() {
		System.out.println("고객님 " + this.coffeename+ "커피가 나왔습니다.");
		
	}

}
