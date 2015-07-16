package encapsulation;

/*
 현재는 홍길동 승리라고 나오는데
 개선
 ==========================
 홍길동 : 6
 김유신 : 4
 홍길동 승리
 ==========================
  
 */


public class CardGame {
/*===== Field =====*/

	private String winner, looser;//멤변 선언
	private int winScore, looseScore;
	
/*===== Constructor =====*/	
	//생성자 단축키
	//CTRL + SPACE
	public CardGame() {} //디폴트 생성자

	public CardGame(CardBean bean1, CardBean bean2) {
		//getter에서 문제해결 패턴
		//제일 먼저 return타입을 copy
		
		String winner = "",looser = "";
		int winScore = 0, looseScore = 0;
		//지역변수(로컬변수)는 메모리 영역 중에서 (콜)스택에 저장
		//인스턴스변수는 메모리영역중에서 힙에 저장
		
		if (bean1.getA() > bean2.getA()) {
			winner = bean1.getName1();
			looser = bean2.getName1();
			winScore = bean1.getA();
			looseScore = bean2.getA();
			
		} else if (bean2.getA() > bean1.getA()) {
			winner = bean2.getName1();
			looser = bean1.getName1();
			winScore = bean2.getA();
			looseScore = bean1.getA();
		}
		else {
			winner = "비김";

		}
		this.winner = winner;
		this.looser = looser;
		this.winScore = winScore;
		this.looseScore = looseScore;

	}
	
/*===== 멤버메소드 =====*/	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "=====================\n"
		+ this.winner +" : "+ this.winScore +"\n"
		+ this.looser +" : "+ this.looseScore +"\n" 
		+ this.winner + "\t승리\n"
		+ "=====================";
	}
}

