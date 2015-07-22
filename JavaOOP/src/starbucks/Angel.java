package starbucks;

import java.util.Scanner;

public class Angel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AngelCoffee kim = new AngelCoffee();
		//System.out.println("[1 : 무설탕(블랙), 2 : 설탕(밀크)] \n선택하세요.");
		//kim.prepare(scanner.nextInt());
		
		AngelTea lee = new AngelTea();
		System.out.println("[3 : 레몬, 4 : 자몽]\n선택하세요.");
		lee.prepare(scanner.nextInt());

	}

}
