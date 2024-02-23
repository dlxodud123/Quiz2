package member.service;

import java.util.Scanner;

import member.dao.MemberDAO;
import member.dto.MemberDTO;

public class MemberServiceImpl implements MemberService{
	private MemberDAO dao;
	public MemberServiceImpl(){
		dao = new MemberDAO();
	}

	@Override
	public void join() {
		MemberDTO dto = new MemberDTO();
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		dto.setName(sc.next());
		System.out.print("내용 : ");
		dto.setContent(sc.next());
		dao.getData(dto);
	}

	@Override
	public void search() {
		
	}

	@Override
	public void list() {
		
	}

	@Override
	public void out() {
		
	}

}
