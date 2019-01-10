package service;

import java.util.ArrayList;

import dao.MemberDaoImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{

	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {
		dao = MemberDaoImpl.getInstance();
	}
	public static MemberServiceImpl getInstance() {return instance;}

	MemberDaoImpl dao;
	
	@Override
	public void creatMember(MemberBean member) {
		System.out.println("맴버서비스 조인에 진입");
		dao.insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> findMembersByList() {
		ArrayList<MemberBean> list =  new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findMembersByName(String name) {
		ArrayList<MemberBean> list =  new ArrayList<>();
		return list;
	}

	@Override
	public MemberBean findMemberById(String id) {
		System.out.println("맴버서비스임플 id 찾기 들어옴 ===");
		return dao.selectMemberById(id);
	}

	@Override
	public int countMembers() {
		int count = 0;
		return count;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean exist = false;
		return exist;
	}

	@Override
	public void changePass(String id, String pass, String newpass) {
	}

	@Override
	public void removeContent(String id, String pass) {
	}

}
