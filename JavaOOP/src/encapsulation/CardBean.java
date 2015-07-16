package encapsulation;

/*
* @ Date : 2015.07.15
* @ Author : me
* @ Story : 생성자 문법
* 생성자는 setter를 통해 값을 할당하는
* 기능을 보강하여, 객체가 만들어짐과 동시에 값을 할당하도록
* 특수하게 만들어진 ★★★메소드이다.
* */

public class CardBean {
/*===== Field =====*/	
	
	private String name1 ,name2;//멤변 초기화 x
	private int a,b;

/*===== Constructor =====*/	
	//생성자 위치는 (멤버)필드와 메소드 영역 사이에 위치
	//생성자 모양
	//public 클래스이름(){}
	public CardBean(){} //디폴트 생성자
	public CardBean(String name1) {
		//setter역할을 겸용하는 생성자
		this.name1 = name1;
		this.a = (int) ((Math.random()*13)+1);
	}
	//디폴트 생성자는 개발자가 직접 만들지 않아도
	//프로그램 내부에서는 생성되어 있는 것으로 인식한다.
	//그런데, 이것을 꺼내 든 이유는 
	//new 키워드를 통한 객체 생성 역할뿐아니라, 
	//생성과 동시에 값을 할달 하는 기능을 추가시키기 위해서....
	
	
/*===== Method =====*/	
	public String getName1() {
		return name1;
	}
	public int getA() {
		return a;
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
