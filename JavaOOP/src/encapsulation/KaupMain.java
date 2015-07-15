package encapsulation;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		
		String name = "", msg ="";
		double height = 0.0d, weight = 0.0d;
		int idx = 0; //카우푸 인덱스
		
		Scanner scanner = new Scanner(System.in);
		
		//연산부
		System.out.println("이름을 입력하세요 : ");
		name = scanner.next();
		System.out.println("키 : ");
		height = scanner.nextDouble();
		System.out.println("몸무게 : ");
		weight = scanner.nextDouble();
		
		
		//2015.07.14 카우푸공식
		KaupBean4 bean = new KaupBean4();
		bean.setName(name);
		bean.setHeight(height);
		bean.setWeight(weight);
		bean.getIndex();
		
		//출력부
		System.out.println(bean.toString());
	}

}
