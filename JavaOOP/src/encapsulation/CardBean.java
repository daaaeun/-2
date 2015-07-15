package encapsulation;

public class CardBean {
	
	private String name1 ,name2;//멤변 초기화 x
	private int a,b;
	
	public void setName1(String name1) {
		//()안에 값을 파라미터하고 소속은 지변
		this.name1 = name1;
		// this.name은 인스턴스변수(멤변)이고
		// = name은 파라미터로 넘어온 지변(스캐너가 받은 값)
		//스캐너가 받아논 값을 가진 지변 값을
		//멤변 name에 할당하라.
		//파라미터값과 멤변값의 이름은 달라도 상관없다.
		//단, 데이터타입(String, int)은 반드시 일치해야한다.
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public void setA() {
		//외부에서 받는 숫자가 없으므로 파라미터가 필요없다.
		this.a = (int) ((Math.random()*13)+1);
		//1부터 13까지의 정수 중에서 랜덤 숫자를 리턴
	}
	public void setB() {
		this.b = (int) ((Math.random()*13)+1);
	}
	public String getWinner() {
		//getter에서 문제해결 패턴
		//제일 먼저 return타입을 copy
		String winner = "";
		if (this.a > this.b) {
			winner = "\t" + name1 + "승리";
			
		} else if (this.b > this.a) {
			winner = "\t" + name2 + "승리";
		}
		else {
			winner = "비김";

		}
		return winner;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+ name1 +" : "+ a +"] vs ["+ name2 +" : "+ b + "]"
				+ this.getWinner();
		
	}
	
	

}
