package encapsulation;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {
		/*
		 * 문제
		 pay 프로그램은 월급을 입력받아서 
		 세금을 떼고 실급여를 고객에게
		 알려주는 프로그램입니다.
		 세율은 10%
		 출력문
		 [홍길동 실급여]
		 월급 : 100만원
		 세금 : 10만원
		 실급여 : 90 만원
		 * */
		
		String name="";//메인메소드 내부의 지역변수
		int pay=0, tax=0, real=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 : ");
		name = scanner.next();
		System.out.println("월급 : ");
		pay = scanner.nextInt();
		
		PayBean payBean = new PayBean();
		payBean.setName(name);
		payBean.setPay(pay);
		System.out.println(payBean.toString());
		System.out.println(payBean.getName()+"님 반갑습니다.");
		
		
		//tax = pay/10;
		//real = pay-tax;

	}

}
