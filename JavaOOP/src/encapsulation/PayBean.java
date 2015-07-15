package encapsulation;

public class PayBean {
	//메소드는 선언부, 연산부, 출력부 이렇게 나누고
	//Bean 클래스라면 멤버필드 + 멤버메소드

	private String name; //멤버필드 변수(멤변)는 초기화를 하지 않는다!!!
	private int pay, tax, real;
	
	//멤버메소드 영역이 시작
	//scanner로 받는것은 set
	//결과값으로 받는것은 get
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getPay() {
		return pay;
	}
	
	
	public int getTax() {
		int tax=0; //지변은 초기화 필수
		tax = (int) (pay * 0.1); 
		return tax;
	}
	/*
	 * this는 이 클래스 내부에 있는 ~~~의미
	 * */
	public int getReal() {
		int real =0; //지변 초기화
		real = pay-this.getTax();
		return real;
	}
	@Override
	public String toString() {
		
		return "["+this.name+"실급여]\n"
				+"월급 : "+this.pay+"만원\n"
				+"세금 : "+this.getTax()+"만원\n"
				+"실급여 : "+this.getReal()+"만원";
	}


		
	
	
}
