package inheritance;

import java.util.Scanner;

public class IphoneMain {
	public static void main(String[] args) {
		/*
		 [콘솔 출력문]
		 아이폰 휴대전화를 사용해서
		 홍길동에게 전화를 검
		 홍길동에게 데이터를 전달
		 */	
		//아이폰이 출력되게 하려면
		//클래스변수(=스태틱변수)는
		//클래스이름.BRAND로 가져오면 됩니다.
		
		Iphone iphone = new Iphone();
		iphone.setCompany(Iphone.BRAND);
		iphone.setPortable(Iphone.TRUE);
		Scanner scanner = new Scanner(System.in);
		
		//클래스명, 필드명 ...get/set 없이 사용하는 이유는
		//은닉화가 필요없는 고정된 값이기 때문에
		//Iphone.BRAND 식으로 사용해야한다.
		
		System.out.println("통화 상대 입력 : ");
		String name = scanner.next();
		iphone.setCall(name);;
		System.out.println("보내는 메세지 입력 : ");
		iphone.setData(name,scanner.next());
		System.out.println(iphone.getCompany()+"을 사용해서");
		System.out.println(iphone.getMove());
		System.out.println(iphone.getCall());
		System.out.println(iphone.getData());
	}
	
}
