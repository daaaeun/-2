package starbucks;

import java.util.Scanner;

public class Starbucks {
	public static void main(String[] args) {
		/*
		 인터페이스를 구현한 클래스의 객체 생성문법
		 인터페이스 인스턴스 = new 생성자();
		 * */
		Recipe coffee = new Coffee();
		Recipe tea = new Tea();
		
		coffee.boilWater();
		coffee.brew();
		coffee.pourInCup();
		System.out.println("4. 설탕 첨가 여부를 손님에게 묻는다.");
		System.out.println("[1 : 무설탕(블랙), 2 : 설탕(밀크)] \n선택하세요.");
		Scanner scanner = new Scanner(System.in);
		coffee.select(scanner.nextInt());
		coffee.serve();
		
		tea.boilWater();
		tea.brew();
		tea.pourInCup();
		System.out.println("4. 레몬, 자몽 첨가 여부를 손님에게 묻는다.");
		System.out.println("[3 : 레몬, 4 : 자몽]\n선택하세요.");
		tea.select(scanner.nextInt());
		tea.serve();
	}
	
	

}
