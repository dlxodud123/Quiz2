package member.main;

import java.util.Scanner;

import member.service.MemberService;
import member.service.MemberServiceImpl;

public class MainClass {
	public static void main(String[] args) {
		MemberService ms = new MemberServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 회원 가입");
		System.out.println("2. 검색");
		System.out.println("3. 목록확인");
		System.out.println("4. 탈퇴");
		System.out.println("5. 종료");
		System.out.print(">>> : ");
		int func = sc.nextInt();
		switch (func) {
		case 1:
			ms.join();
			break;
		case 2:
			ms.search();
			break;
		case 3:
			ms.list();
			break;
		case 4:
			ms.out();
			break;
		case 5:
			System.out.println("종료되었습니다.");
			return;
		default:
			break;
		}
	}
}
