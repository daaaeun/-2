package encapsulation;

public class Blue {
/*===== Field =====*/
	//주사위 2개 값의 합
	private int sum; //인스턴스 변수는 초기화 하지 않는다.
					//클래스있으면 거의 인변
/*===== Constructor =====*/
	// 생성자 파라미터 2개(주사위)
	public Blue(Dice dice1,Dice dice2) {
		this.sum = dice1.getNum() + dice2.getNum();
		
	}
	
/*===== MemberMethod =====*/	
	@Override
	public String toString() {
		return "두 주사위의 합이 " + this.sum + "이니 " + this.sum + "칸 전진";
	}

}
